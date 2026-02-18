package domain;

import java.time.LocalDate;

public class Person {
    protected String surName;
    protected String givenName;
    private String patronymic;
    private LocalDate dateOfBitrth;
    private Adress adress;

    public Person(){
        System.out.println("Person is created");
    }

    public String getPersonString(){
        return surName + " " + givenName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBitrth() {
        return dateOfBitrth;
    }

    public void setDateOfBitrth(LocalDate dateOfBitrth) {
        this.dateOfBitrth = dateOfBitrth;
    }


    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
