package com.loantable.loantable.ServiceImplementation;

import com.loantable.loantable.Domain.Credit;
import com.loantable.loantable.Repository.CreditRepository;
import com.loantable.loantable.Service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreditImplementation implements CreditService {

    @Autowired
    private CreditRepository creditrepository;
    @Override
    public Credit saveCredit(Credit credit) {
        return creditrepository.save(credit);
    }

    @Override
    public Optional<Credit> findById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Credit> findAll(Class c) {
        return creditrepository.findAll();
    }
}
