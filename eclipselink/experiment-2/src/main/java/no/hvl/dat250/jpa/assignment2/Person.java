package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "Person_Address")
    private Collection<Address> addresses = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Person_Creditcard")
    private Collection<CreditCard> creditcards = new ArrayList<>();


    public void setName(String newName) {
        this.name = newName;
    }

    public void setAddresses(Address address) {
        this.addresses.add(address);
    }

    public void setCreditcards(CreditCard creditcard) {
        this.creditcards.add(creditcard);
    }

    public String getName() {
        return name;
    }

    public Collection<Address> getAddresses() {
        return addresses;
    }

    public Collection<CreditCard> getCreditCards() {
        return creditcards;
    }
}
