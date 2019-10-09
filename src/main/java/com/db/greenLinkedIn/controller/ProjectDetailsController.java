package com.db.greenLinkedIn.controller;

import com.db.greenLinkedIn.impl.SubmitProjectDetailsImpl;
import com.db.greenLinkedIn.impl.UserDetailsImpl;
import com.db.greenLinkedIn.model.ProjectDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectDetailsController {
    @Autowired
    SubmitProjectDetailsImpl submitProjectDetails;

    @PostMapping(value = "/submitProjectDetails")
    public String submitProjectDetails(@RequestBody ProjectDetails projectDetails) {
        System.out.print("submit project details");
        //return null;
        return submitProjectDetails.submitProjectDetails(projectDetails);
    }

    @GetMapping(value="/getProjectDetails")
    public List<ProjectDetails> getProjectDetails (){
        return submitProjectDetails.getProjectDetails();
    }

    @GetMapping(value="/getMyProjects/{username}")
    public List<ProjectDetails> getMyProjects(@PathVariable String username){
        return submitProjectDetails.getMyProjects(username);
    }
}
