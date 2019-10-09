package com.db.greenLinkedIn.repository;


import com.db.greenLinkedIn.middleware.userLogin;
import com.db.greenLinkedIn.model.UserDetails;

public interface UserDetailsInterface {
    public String loginCheck(userLogin userDetails);
    public String signUp();
}
