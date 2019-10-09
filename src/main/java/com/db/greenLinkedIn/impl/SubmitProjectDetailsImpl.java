package com.db.greenLinkedIn.impl;

import com.db.greenLinkedIn.model.ProjectDetails;
import com.db.greenLinkedIn.repository.ProjectDetailsInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubmitProjectDetailsImpl implements ProjectDetailsInterface {

    @Autowired
    JdbcTemplate jdbcTemplate;
    @Override
    public String submitProjectDetails(ProjectDetails projectDetails) {
        String  query = "insert into project_details (projectName, ProjectDescription, CurrentInvestmentAmount, username) values (?,?,?,?)";

        try{
            System.out.print("projectDetails"+projectDetails.getProjectDescription()+projectDetails.getCurrentInvestmentAmount()+projectDetails.getProjectName());
            jdbcTemplate.update(query,new Object[]{projectDetails.getProjectName(),
                    projectDetails.getProjectDescription(),
                    projectDetails.getCurrentInvestmentAmount(),projectDetails.getUsername()});
        }catch (Exception e) {
            System.out.println("error in insertion of project details" +" "+e);
            return "failure";
        }
        return "success";
    }

    @Override
    public List<ProjectDetails> getProjectDetails() {
        String  query = "Select * from project_details";
        List<ProjectDetails> list = new ArrayList<ProjectDetails>();
        list=null;
        try{
            System.out.println("fetching list");
            list = jdbcTemplate.query(query,
                    new BeanPropertyRowMapper(ProjectDetails.class));
            System.out.println("List is "+list);
        }catch (Exception e){
            System.out.print("exception is "+e.toString());
        }
        return list;
    }

    @Override
    public List<ProjectDetails> getMyProjects(String username) {
        String  query = "Select * from project_details where username = ?";
        List<ProjectDetails> list = new ArrayList<ProjectDetails>();
        list=null;
        try{
            System.out.println("fetching list");
            list = jdbcTemplate.query(query,new Object[]{username},
                    new BeanPropertyRowMapper(ProjectDetails.class));
            System.out.println("List is "+list);
        }catch (Exception e){
            System.out.print("exception is "+e.toString());
        }
        return list;

    }
}
