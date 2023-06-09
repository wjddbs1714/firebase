package com.example.codevalley;

public class HelperClass {

    String username, password, name, birth, phone;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() { return birth; }
    public void setBirth(String birth) { this.birth = birth;}

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }


    public HelperClass(String username, String password, String name, String birth, String phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.birth = birth;
        this.phone = phone;
    }

    public HelperClass() {
    }
}
