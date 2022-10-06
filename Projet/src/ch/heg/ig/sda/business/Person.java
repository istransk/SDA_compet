package ch.heg.ig.sda.business;

import java.time.LocalDate;

/**
 * @author isabelle.stransky
 */
public abstract class Person {
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate dateOfBirth;


    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(String firstName, String lastName, char gender, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Compare si deux personnes sont identiques en comparant le nom et prénom
     * (pas idéal comme deux personnes peuvent être homonymes
     * @param person
     * @return boolean
     */
    public boolean isEquals(Person person) {
        return (this.firstName == person.firstName) && (this.lastName == person.lastName);
    }
}
