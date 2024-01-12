package com.example.member_parcable;


import java.io.Serializable;

public class Member implements Serializable {
    private String name;
    private String patronymic;
    private String surname;

    public Member(String name, String z, String odinayev) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getSurname() {
        return surname;
    }
}