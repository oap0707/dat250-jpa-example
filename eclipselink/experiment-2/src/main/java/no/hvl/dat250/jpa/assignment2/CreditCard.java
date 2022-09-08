package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private Integer limit;
    private Integer balance;
    @OneToOne()
    //foreign key
    @JoinColumn(name = "pincodeId")
    private Pincode pincode;

    @ManyToOne(targetEntity = Bank.class)
    @JoinColumn(name = "bankID")
    private Bank myBank;

    public void setBank(Bank bank) {
        this.myBank = bank;
    }

    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }

    public void setNumber(Integer newNumber) {
        this.number = newNumber;
    }

    public void setLimit(Integer newLimit) {
        this.limit = newLimit;
    }

    public void setBalance(Integer newBalance) {
        this.balance = newBalance;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getBalance() {
        return balance;
    }

    public Integer getLimit() {
        return limit;
    }

    public Pincode getPincode() {
        return pincode;
    }

    public Bank getOwningBank() {
        return myBank;
    }
}
