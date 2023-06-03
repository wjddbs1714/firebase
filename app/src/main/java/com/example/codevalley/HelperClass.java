package com.example.codevalley;

public class HelperClass {

    String name, phone, username, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public HelperClass(String name, String phone, String username, String password) {
        this.name = name;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public HelperClass() {
    }
}
