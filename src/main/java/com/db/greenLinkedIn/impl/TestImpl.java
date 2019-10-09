package com.db.greenLinkedIn.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestImpl {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String bhakk() {
        String sql = "Select count(*) from project_details";
        Integer data = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.print(data + " records found");
        return data.toString();
    }
}
