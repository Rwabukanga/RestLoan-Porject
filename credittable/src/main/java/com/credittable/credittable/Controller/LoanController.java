package com.credittable.credittable.Controller;

import com.credittable.credittable.Domain.Credit;
import com.credittable.credittable.Domain.Loan;
import com.credittable.credittable.Service.CreditService;
import com.credittable.credittable.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/loan")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @Autowired
    private CreditService creditService;


    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Loan> saveDepartment(@RequestBody Loan loan){
        Loan savedloan = loanService.saveLoan(loan);
        return new ResponseEntity<>(savedloan, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Loan> getDepartmentById(@PathVariable("id") Integer id) {
        Optional<Loan> loan = loanService.getLoanById(id);
        Loan loann = null;
        if (loan.isPresent()) {
            loann = loan.get();
        }


        return ResponseEntity.ok(loann);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getLoan(){
        List<Loan> loann=loanService.findAll(Loan.class);
        return new ResponseEntity<Object> (loann, HttpStatus.OK);
    }

    @PostMapping("/send")
    public ResponseEntity<Object> createLoanRest(@RequestBody Credit body) {

        String uri= "http://localhost:10001/api/credit/save";

        RestTemplate restTemplate = new RestTemplate();
        try {

            System.out.print("Hello...............");

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            ResponseEntity<Loan> result = restTemplate.postForEntity(uri, body, Loan.class);

            if( creditService.findById(body.getId())){
                body.setResponse(Boolean.parseBoolean("True"));
            }

            System.out.println("Send");

            return new ResponseEntity<Object>( result.getStatusCodeValue() == 200 ? "Loan created successfully" : "Loan Not created successfully", HttpStatus.OK);

        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>("Error!, Please try again", HttpStatus.INTERNAL_SERVER_ERROR);
        }



    }

}
