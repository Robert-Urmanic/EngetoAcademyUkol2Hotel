package com.engeto.urm.ukolHotel;

import java.time.LocalDate;

public class Guest {

    private String name;
    private String surname;
    private LocalDate dateOfBirth;

    public Guest(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    // Nothing to add, typical automatically generated constructor, getters and setters...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDescription(){
        return "Guest " + name + " " + surname + "\nwas born on: " + dateOfBirth;
    }

    @Override
    public String toString() {
        return "Guest " + name + " " + surname + "\nwas born on: " + dateOfBirth;
    }
    // overriding toString for obvious reasons

}
