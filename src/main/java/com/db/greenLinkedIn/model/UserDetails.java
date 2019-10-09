package com.db.greenLinkedIn.model;

import com.db.greenLinkedIn.middleware.userLogin;

public class UserDetails extends userLogin {

    private int id;
    private String email;
    private String phone;
    private String userRole;
    private String fullname;


    public UserDetails(int id, String userName, String password, String userRole, String fullname, String email, String phone) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userRole='" + userRole + '\'' +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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


}
