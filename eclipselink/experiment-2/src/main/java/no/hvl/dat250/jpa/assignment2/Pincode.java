package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public void setPincode(String newPincode) {
        this.pincode = newPincode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getPincode() {
        return pincode;
    }

    public int getCount() {
        return count;
    }
}
