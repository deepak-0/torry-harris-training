package com.torryharris.model;

public class Lead extends Employee{
    int teamSize;

    public Lead(String name, int employeeId, String designation, float salary, int teamSize) {
        super(name, employeeId, designation, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void standUpCall(){
        System.out.println("Stand up call in 10 minutes");
    }

    @Override
    public String toString() {
        return "\nLead" + super.toString()+
                "\nteamSize=" + teamSize +"\n";
    }
}
