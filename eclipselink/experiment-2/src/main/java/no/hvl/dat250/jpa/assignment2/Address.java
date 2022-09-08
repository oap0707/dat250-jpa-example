package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer number;

    @ManyToMany(mappedBy = "addresses")
    private Set<Person> owners = new HashSet<>();

    public void setStreet(String newStreet) {
        // TODO: implement method!
        this.street = newStreet;
    }

    public void setNumber(Integer newNumber) {
        // TODO: implement method!
        this.number = newNumber;
    }

    public void setOwner(Person newOwner) {
        // TODO: implement method!
        this.owners.add(newOwner);
    }

    public String getStreet() {
        // TODO: implement method!
        return street;
    }

    public Integer getNumber() {
        // TODO: implement method!
        return number;
    }

    public Collection<Person> getOwners() {
        // TODO: implement method!
        return owners;
    }
}
