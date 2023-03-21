package com.credittable.credittable.ServiceImplementation;

import com.credittable.credittable.Domain.Credit;
import com.credittable.credittable.Repository.CreditRepository;
import com.credittable.credittable.Service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditServiceImplementation implements CreditService {

    @Autowired
    private CreditRepository creditRepository;
    @Override
    public Credit saveCredit(Credit credit) {
        return creditRepository.save(credit);
    }

    @Override
    public boolean findById(int id) {
        return false;
    }

    @Override
    public List<Credit> findAll(Class c) {
        return creditRepository.findAll();
    }
}
