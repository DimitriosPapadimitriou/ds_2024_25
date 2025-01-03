package hua.ds_project.project.entities;

import jakarta.persistence.*;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String email;

    @Column
    private String phoneNumber;

    @Column
    private String IBAN;

    @Column
    private Integer numberOfEstates;

    @Column
    private Integer availableEstates;

    public Owner() {
    }

    public Owner(Integer id, String firstName, String lastName, String email, String phoneNumber, String IBAN, Integer numberOfEstates, Integer availableEstates) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.IBAN = IBAN;
        this.numberOfEstates = numberOfEstates;
        this.availableEstates = availableEstates;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Integer getNumberOfEstates() {
        return numberOfEstates;
    }

    public void setNumberOfEstates(Integer numberOfEstates) {
        this.numberOfEstates = numberOfEstates;
    }

    public Integer getAvailableEstates() {
        return availableEstates;
    }

    public void setAvailableEstates(Integer availableEstates) {
        this.availableEstates = availableEstates;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", IBAN='" + IBAN + '\'' +
                ", numberOfEstates=" + numberOfEstates +
                ", availableEstates=" + availableEstates +
                '}';
    }
}
