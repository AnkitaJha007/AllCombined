package ConsumerPredicate;

import java.util.function.Consumer;
import java.util.List;
 class ConsumerData {
    public static void printEmployeeDetails(List<Employee> employees) {
        Consumer<Employee> empDetails = System.out::println;

        System.out.println("Employee Details:");
        employees.forEach(empDetails);
    }
}





