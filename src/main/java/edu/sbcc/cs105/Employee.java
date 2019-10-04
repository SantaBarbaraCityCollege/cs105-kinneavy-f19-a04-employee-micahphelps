/**
 * CS 105 Theory and Practice I
 * CRN: 38066
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Micah Phelps
 */
package edu.sbcc.cs105;

/**
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */
public class Employee {

    private String name;
    private double salary;

    /**
     Constructor that creates a new Employee with an initial name and salary.
     @employeename Harry
     @currentSalary 10000
     */
  public Employee(String employeeName, double currentSalary) {

    name = employeeName;
    salary = currentSalary;
		// TODO: Initialize instance variables from constructor (ctor) parameters
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.
    public String getName() {
      return name;
		// TODO: Return the name of the employee;
    }

    public double getSalary() {
      return salary;
		// TODO: Return the current salary of the employee
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    public void raiseSalary(double byPercent) {

      salary = salary + (salary*byPercent)/100;
		// TODO: Calculate the new salary by increasing it by the percent passed in as a method argument
    }
}