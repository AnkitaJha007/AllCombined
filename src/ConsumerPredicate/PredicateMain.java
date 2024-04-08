package ConsumerPredicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateMain {
    public static void main(String[] args) {

        Predicate<Employee> moreThan2k = emp -> emp.getSalary() > 2000;
        EmployeeList employeeList = new EmployeeList();
        List<Employee> employees = employeeList.getE();
        for (Employee e : employees) {
            System.out.println(e.getFirstName() + "salary is above 2000: " + moreThan2k.test(e));

        }
    }
}
