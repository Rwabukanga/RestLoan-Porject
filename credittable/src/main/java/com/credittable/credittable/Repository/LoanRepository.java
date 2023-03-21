package com.credittable.credittable.Repository;

import com.credittable.credittable.Domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {

Optional<Loan> findById(int id);
}
