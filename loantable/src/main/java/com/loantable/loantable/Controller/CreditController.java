package com.loantable.loantable.Controller;

import com.loantable.loantable.Domain.Credit;
import com.loantable.loantable.Service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value="/api/credit")
public class CreditController {

    @Autowired
    private CreditService creditService;


    @RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Credit> saveCredit(@RequestBody Credit credit){
        Credit creditt = creditService.saveCredit(credit);
        return new ResponseEntity<>(creditt, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getLoan(){
        List<Credit> credit=creditService.findAll(Credit.class);
        return new ResponseEntity<Object> (credit, HttpStatus.OK);
    }

}
