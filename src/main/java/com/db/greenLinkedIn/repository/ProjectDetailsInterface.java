package com.db.greenLinkedIn.repository;

import com.db.greenLinkedIn.model.ProjectDetails;

import java.util.List;

public interface ProjectDetailsInterface {
    public String submitProjectDetails(ProjectDetails projectDetails);
    public List<ProjectDetails> getProjectDetails();
    public  List<ProjectDetails> getMyProjects(String username);
}
