package com.loantable.loantable.Service;

import com.loantable.loantable.Domain.Credit;

import java.util.List;
import java.util.Optional;

public interface CreditService {

    public Credit saveCredit(Credit credit);

    public Optional<Credit> findById(int id);

    public List<Credit> findAll(Class c);

}
