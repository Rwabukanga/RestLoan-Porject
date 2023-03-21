package com.credittable.credittable.Domain;

import javax.persistence.*;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String accountnumber;

    @Column(name = "accountOwner", nullable = false)
    private String accountOwner;

    @Column(name = "accountRepaymentTerm", nullable = false)
    private String accountRepaymentTerm;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getAccountRepaymentTerm() {
        return accountRepaymentTerm;
    }

    public void setAccountRepaymentTerm(String accountRepaymentTerm) {
        this.accountRepaymentTerm = accountRepaymentTerm;
    }


    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", accountnumber='" + accountnumber + '\'' +
                ", accountOwner='" + accountOwner + '\'' +
                ", accountRepaymentTerm='" + accountRepaymentTerm + '\'' +
                '}';
    }
}
