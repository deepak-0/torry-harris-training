package com.torryharris.model;

public class Manager extends Employee{
    String projectName;
    int noOfTeams;

    public Manager(String name, int employeeId, String designation, float salary, String projectName, int noOfTeams) {
        super(name, employeeId, designation, salary);
        this.projectName = projectName;
        this.noOfTeams = noOfTeams;
    }

    public Manager(String s) {
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getNoOfTeams() {
        return noOfTeams;
    }

    public void setNoOfTeams(int noOfTeams) {
        this.noOfTeams = noOfTeams;
    }

    public void CallMeeting(){
        System.out.println("Meeting in Progress........");
    }

    @Override
    public String toString() {
        return "\nManager " + super.toString()+
                "\nProjectName='" + projectName + '\'' +
                ",\n NoOfTeams=" + noOfTeams + "\n"
                ;
    }


}
