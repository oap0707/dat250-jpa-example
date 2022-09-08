package no.hvl.dat250.jpa.assignment2.driver;

import no.hvl.dat250.jpa.assignment2.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        // TODO: Persist object world corresponding to the domain model of experiment 2.
        Person person = new Person();
        Address address = new Address();
        CreditCard firstCreditcard = new CreditCard();
        CreditCard secondCreditcard = new CreditCard();
        Pincode pincode = new Pincode();
        Bank bank = new Bank();

        person.setName("Max Mustermann");

        address.setStreet("Inndalsveien");
        address.setNumber(28);

        person.setAddresses(address);
        address.setOwner(person);

        firstCreditcard.setNumber(12345);
        firstCreditcard.setBalance(-5000);
        firstCreditcard.setLimit(-10000);

        secondCreditcard.setNumber(123);
        secondCreditcard.setBalance(1);
        secondCreditcard.setLimit(2000);

        pincode.setPincode("123");
        pincode.setCount(1);

        bank.setName("Pengebank");
        bank.setOwnedCards(firstCreditcard);
        bank.setOwnedCards(secondCreditcard);

        firstCreditcard.setBank(bank);
        secondCreditcard.setBank(bank);

        firstCreditcard.setPincode(pincode);
        secondCreditcard.setPincode(pincode);

        person.setCreditcards(firstCreditcard);
        person.setCreditcards(secondCreditcard);

        tx.begin();
        em.persist(bank);
        em.persist(firstCreditcard);
        em.persist(secondCreditcard);
        em.persist(pincode);
        em.persist(address);
        em.persist(person);
        tx.commit();

        em.close();
        factory.close();
    }
}
