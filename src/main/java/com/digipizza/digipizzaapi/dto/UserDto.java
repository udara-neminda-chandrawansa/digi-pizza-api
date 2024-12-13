package com.digipizza.digipizzaapi.dto;

import jakarta.persistence.Id;

public class UserDto {

    // attribs
    @Id
    private int id;
    private String username;
    private String password;
    private String email;
    private String telNo;

    // no-args constructor
    public UserDto() {
    }

    // all-args constructor
    public UserDto(int id, String username, String password, String email, String telNo) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.telNo = telNo;
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
