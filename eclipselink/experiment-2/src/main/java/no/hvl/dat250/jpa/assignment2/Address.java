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
        this.street = newStreet;
    }

    public void setNumber(Integer newNumber) {
        this.number = newNumber;
    }

    public void setOwner(Person newOwner) {
        this.owners.add(newOwner);
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public Collection<Person> getOwners() {
        return owners;
    }
}
