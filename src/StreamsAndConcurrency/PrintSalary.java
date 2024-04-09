package StreamsAndConcurrency;

import ConsumerPredicate.Employee;
import ConsumerPredicate.EmployeeList;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class PrintSalary {
    public static void main (String args[]){
        EmployeeList el = new EmployeeList();
        List<Employee> e = el.getE();
    String dept = "IT";
    DoubleSummaryStatistics dss= e.stream()
            .filter(emp -> emp.getDepartment().equals(dept))
            .mapToDouble(Employee::getSalary)
            .summaryStatistics();

        System.out.println("All Employee Details from '" + dept + "':");
        System.out.println("Count: " + dss.getCount());
        System.out.println("Min salary: " + dss.getMin());
        System.out.println("Max salary: " + dss.getMax());
        System.out.println("Sum     : " + dss.getSum());
        System.out.println("Average salary: " + dss.getAverage());
}
}
