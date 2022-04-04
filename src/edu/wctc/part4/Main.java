package edu.wctc.part4;

/**
 * This class is the startup class for the program. But together with the other
 * classes provided it is not a particularly good simulation of the real world.
 * Employees don't just hire themselves and them tell themselves to go through
 * orientation. There's usually a company and a HR person involved.
 *
 * Refer to the Employee class for further directions.
 */


// I thought I'd also add the public methods that were mentioned to have been used in the future as stated by the previous parts
// since they're public methods
// Given that this is just a lab, I would have spent the time to add a new automatically assigned value of an employeeId,
// but for now, I'll just use the SSN as the employee ID
public class Main {

    public static void main(String[] args) {

        Company company = new Company();
        company.newEmployee("Peter", "Piper", "333-33-3333", "A101");
        company.newEmployee("Jim", "Boe", "123456789", "A102");
        company.changeCubicle("123456789", "A103");
        company.viewedNewPolicy("333-33-3333");
    }
}