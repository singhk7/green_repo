package com.db.greenLinkedIn.model;

public class ProjectDetails {
    private int projectID;
    private String projectName;
    private String projectDescription;
    private String currentInvestmentAmount;
    private String username;

    public void setProjectID(int projectID) {
        projectID = projectID;
    }

    public int getProjectID() {
        return projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getCurrentInvestmentAmount() {
        return currentInvestmentAmount;
    }

    public void setCurrentInvestmentAmount(String currentInvestmentAmount) {
        this.currentInvestmentAmount = currentInvestmentAmount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

