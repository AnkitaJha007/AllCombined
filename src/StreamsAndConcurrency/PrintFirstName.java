package StreamsAndConcurrency;

import ConsumerPredicate.Employee;
import ConsumerPredicate.EmployeeList;

import java.util.List;

public class PrintFirstName {
    public static void main (String args[]){
        EmployeeList el = new EmployeeList();
        List<Employee> e = el.getE();

        e.stream().filter(emp->emp.getJoiningYear()==2023)
                        .map(Employee::getFirstName).forEach(System.out::println);

    }

}
