package StreamsAndConcurrency;
import ConsumerPredicate.Employee;
import ConsumerPredicate.EmployeeList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class CommaSepFirstNames {
    public static void main(String[] args) {
        EmployeeList el = new EmployeeList();
        List<Employee> e = el.getE();
        String commaSeparated = e.stream()
            .sorted(Comparator.comparing(Employee::getDateOfBirth).reversed())
            .map(Employee::getFirstName)
            .collect(Collectors.joining(", "));

        System.out.println("first names with comma seperated ordered by date of birth:");
        System.out.println(commaSeparated);
}
}

