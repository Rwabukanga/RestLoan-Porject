package com.loantable.loantable.Repository;

import com.loantable.loantable.Domain.Credit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CreditRepository extends JpaRepository<Credit, Integer> {

    Optional<Credit> findById(int id);
}
