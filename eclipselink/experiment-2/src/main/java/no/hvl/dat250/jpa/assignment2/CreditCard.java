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
    @OneToOne
    @JoinColumn(name = "pincode_id")
    private Pincode pincode;

    @ManyToOne(targetEntity = Bank.class)
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

    public int getNumber() {
        // TODO: implement method!
        return number;
    }

    public String getBalance() {
        // TODO: implement method!
        return balance.toString();
    }

    public String getLimit() {
        // TODO: implement method!
        return limit.toString();
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
