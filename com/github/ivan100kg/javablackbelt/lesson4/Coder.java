package com.github.ivan100kg.javablackbelt.lesson4;

import java.util.Objects;

public class Coder {
    private String firstName;
    private String lastName;
    private String language;

    public Coder(String firstName, String lastName, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", language='" + language + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coder coder = (Coder) o;
        return Objects.equals(firstName, coder.firstName) && Objects.equals(lastName, coder.lastName) && Objects.equals(language, coder.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, language);
    }
}
