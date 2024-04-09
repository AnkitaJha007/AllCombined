package StreamsAndConcurrency;
import ConsumerPredicate.Employee;
import ConsumerPredicate.EmployeeList;
import java.util.List;
public class IncrementedSalary {
    public static void main(String[] args) {
        EmployeeList el = new EmployeeList();
        List<Employee> e = el.getE();
        String dept = "IT";
        double incPer = 0.10;

        e.stream()
                .filter(emp -> emp.getDepartment().equals(dept))
                .peek(emp -> {
                    emp.setSalary(emp.getSalary() * (1 + incPer));

                })
                .forEach(emp -> System.out.println("First Name: " + emp.getFirstName() +
                        ", Incremented Salary: " + emp.getSalary()));
    }
}
