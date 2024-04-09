package Lambda;
import ConsumerPredicate.Employee;
import ConsumerPredicate.EmployeeList;
import java.util.Comparator;
import java.util.List;
public class SortEmployees {
    public static void main(String[] args) {
        EmployeeList el = new EmployeeList();
        List<Employee> employees = el.getE();
        employees.sort(Comparator.comparingInt(emp -> emp.getDateOfBirth().getMonthValue()));
        System.out.println("Employees by Month after sorting:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
