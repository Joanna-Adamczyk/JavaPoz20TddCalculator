package pl.jnowacki.model;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate birthDate;
    private LocalDate deathDate;
    private Gender gender;

    public Person(String name, LocalDate birthDate, Gender gender) {
        this(name, birthDate, null, gender);
    }

    public Person(String name, LocalDate birthDate, LocalDate deathDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDate getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(LocalDate deathDate) {
        this.deathDate = deathDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}