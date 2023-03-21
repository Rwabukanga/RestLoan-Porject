package com.credittable.credittable.ServiceImplementation;

import com.credittable.credittable.Domain.Loan;
import com.credittable.credittable.Repository.LoanRepository;
import com.credittable.credittable.Service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanServiceImplementation implements LoanService {

    @Autowired
    private LoanRepository loanrepository;

    @Override
    public Loan saveLoan(Loan loan) {
        return loanrepository.save(loan);
    }

    @Override
    public Optional<Loan> getLoanById(int id) {
        return loanrepository.findById(id);
    }

    @Override
    public List<Loan> findAll(Class c) {
        return loanrepository.findAll();
    }
}
