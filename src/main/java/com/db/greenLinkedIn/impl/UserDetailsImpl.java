package com.db.greenLinkedIn.impl;

import com.db.greenLinkedIn.middleware.userLogin;
import com.db.greenLinkedIn.model.UserDetails;
import com.db.greenLinkedIn.repository.UserDetailsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsImpl implements UserDetailsInterface {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public String loginCheck(userLogin userDetails) {
        String sql = "Select userRole from user_details where userName=? and password=?";
        String data = "";
        try {
            System.out.print(userDetails.getUserName()+ " "+ userDetails.getPassword());
            data = jdbcTemplate.queryForObject(sql, new Object[]{userDetails.getUserName(), userDetails.getPassword()},
                     String.class);
        } catch (Exception e) {
            System.out.println("error in login");
        }
        System.out.print(data + " records found");
        return data!="" ? data : "invalid user";
    }

    @Override
    public String signUp() {
        return "hi";
    }
}
