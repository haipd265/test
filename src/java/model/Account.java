/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Legion
 */
public class Account {
    private String username;
    private String pass;
    private String address;
    private String email;
    private String phone;
    private String logo;
    private int role;

    public Account() {
    }

    public Account(String username, String pass, String address, String email, String phone, String logo, int role) {
        this.username = username;
        this.pass = pass;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.logo = logo;
        this.role = role;
    }


    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
}
