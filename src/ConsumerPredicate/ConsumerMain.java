package ConsumerPredicate;

import java.util.List;
public class ConsumerMain {
    public static void main(String[] args) {
        // Create an instance of EmployeeList
        EmployeeList employeeList = new EmployeeList();

        // Retrieve the list of employees from the EmployeeList class
        List<Employee> employees = employeeList.getE();
        System.out.println("emp:");
        for(Employee e : employees){
            if(e.getSalary()>2000){
                System.out.println(e);
            }
        }
        ConsumerData.printEmployeeDetails(employees);
    }
}

