package edu.wctc.part4;

import java.util.ArrayList;
import java.util.List;

public class HrPerson {

    private List<Employee> employeeList = new ArrayList<>();

    public void hireEmployee(String firstName, String lastName, String ssn, String cubeId){
        Employee employee = new Employee(firstName, lastName, ssn);
        employeeList.add(employee);
        employee.doFirstTimeOrientation(cubeId);
        printReport(firstName, lastName, ssn);
    }

    public void assignCubicle(String ssn, String cubeId){
        for (Employee employee:employeeList) {
            if (employee.getSsn().equals(ssn)){
                employee.moveIntoCubicle(cubeId);
                employee.printReport();
                break;
            }
        }
    }

    public void newPolicy(String ssn){
        for (Employee employee:employeeList) {
            if (employee.getSsn().equals(ssn)){
                employee.reviewDeptPolicies();
                employee.printReport();
                break;
            }
        }
    }

    private void printReport(String firstName, String lastName, String ssn){
        for (Employee employee:employeeList) {
            if (employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName)
                    && employee.getSsn().equals(ssn)){
                if(employee.hasMetDeptStaff() && employee.hasMetWithHr()
                        && employee.hasMovedIn() && employee.hasReviewedDeptPolicies()){
                    employee.printReport();
                    break;
                }
            }
        }

    }


}
