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
        // TODO: implement method!
        return number;
    }

    public Integer getBalance() {
        // TODO: implement method!
        return balance;
    }

    public Integer getLimit() {
        // TODO: implement method!
        return limit;
    }

    public Pincode getPincode() {
        // TODO: implement method!
        return pincode;
    }

    public Bank getOwningBank() {
        // TODO: implement method!
        return myBank;
    }
}
