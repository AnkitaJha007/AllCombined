package ConsumerPredicate;

import java.time.LocalDate;
public class Employee {
    private String firstName;
    private String lastName;
    private int id;
    private LocalDate dateOfBirth;
    private double salary;
    private String department;

    private int joiningYear;
    public int getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(int joiningYear) {
        this.joiningYear = joiningYear;
    }



    public Employee(String firstName, String lastName, int id, LocalDate dateOfBirth, double salary, String department,int joiningYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.department = department;
        this.joiningYear = joiningYear;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to update salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    // Method to update department
    public void updateDepartment(String newDepartment) {
        this.department = newDepartment;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + "\nName: " + firstName + " " + lastName + "\nDate of Birth: " + dateOfBirth +
                "\nSalary: " + salary + "\nDepartment: " + department + "\nJoining Year:" + joiningYear;
    }

}