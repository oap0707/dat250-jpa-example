package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "myBank")
    private Set<CreditCard> creditcardSet = new HashSet<>();


    public void setOwnedCards(CreditCard creditCard) {
        this.creditcardSet.add(creditCard);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<CreditCard> getOwnedCards() {
        return creditcardSet;
    }
}
