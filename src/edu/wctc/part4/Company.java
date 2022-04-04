package edu.wctc.part4;

public class Company {

    private HrPerson hrPerson;

    public Company() {
        hrPerson = new HrPerson();
    }

    public void newEmployee(String firstName, String lastName, String ssn, String cubeId) {
        hrPerson.hireEmployee(firstName, lastName, ssn, cubeId);
    }

    public void changeCubicle(String ssn, String cubeId){
        hrPerson.assignCubicle(ssn,cubeId);
    }

    public void viewedNewPolicy(String ssn){
     hrPerson.newPolicy(ssn);
    }
}
