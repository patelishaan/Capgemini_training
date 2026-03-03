package org.example;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
    @Id
    @GeneratedValue
    private int passportId;

    private String country;

    private String passportNumber;

    @OneToOne(mappedBy = "passport")
    private Human human;

    public int getPassportId(){
        return passportId;
    }
}
