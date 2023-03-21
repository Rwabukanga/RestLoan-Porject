package com.credittable.credittable.Service;

import com.credittable.credittable.Domain.Credit;

import java.util.List;

public interface CreditService {

    public Credit saveCredit(Credit credit);

    public boolean findById(int id);

    public List<Credit> findAll(Class c);

}
