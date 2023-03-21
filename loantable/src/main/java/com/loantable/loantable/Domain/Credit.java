package com.loantable.loantable.Domain;

import javax.persistence.*;

@Entity
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String accountnumber;

    @Column(name = "accountOwner", nullable = false)
    private String accountOwner;

    @Column(name = "accountRepaymentTerm", nullable = false)
    private String accountRepaymentTerm;

    private boolean response;


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

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "id=" + id +
                ", accountnumber='" + accountnumber + '\'' +
                ", accountOwner='" + accountOwner + '\'' +
                ", accountRepaymentTerm='" + accountRepaymentTerm + '\'' +
                ", response=" + response +
                '}';
    }
}
