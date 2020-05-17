package com.dbApp.model;

public class Manufacturer {
    public static final String TABLE_NAME = "manufacturer";
    public static final String ID_COLUMN = "id";
    public static final String NAME_COLUMN = "name";
    public static final String EMAIL_COLUMN = "email";


    private Long id;
    private String name;
    private String email;


    public Manufacturer(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name +
                ", email='" + email +
                '}';
    }
}
