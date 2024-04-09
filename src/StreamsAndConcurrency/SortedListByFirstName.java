package StreamsAndConcurrency;

import ConsumerPredicate.Employee;
import ConsumerPredicate.EmployeeList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListByFirstName {
    public static void main (String args[]){
        EmployeeList el = new EmployeeList();
        List<Employee> e = el.getE();
        List<Employee> sortedEmployees = e.stream()
            .filter(emp -> !emp.getDepartment().equals("HR"))
            .sorted(Comparator.comparing(Employee::getFirstName))
            .toList();

        System.out.println("Sorted list of employees fro all dept except HR:");
        sortedEmployees.forEach(emp -> System.out.println(emp.getFirstName() + " - " + emp.getDepartment()));
}
}
