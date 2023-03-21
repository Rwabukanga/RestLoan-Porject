package com.credittable.credittable.Service;

import com.credittable.credittable.Domain.Loan;

import java.util.List;
import java.util.Optional;

public interface LoanService {

    public Loan saveLoan(Loan loan);

    public Optional<Loan> getLoanById(int id);

    public List<Loan> findAll(Class c);

}
