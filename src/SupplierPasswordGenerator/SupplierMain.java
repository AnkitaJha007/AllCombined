package SupplierPasswordGenerator;
import ConsumerPredicate.Employee;
import ConsumerPredicate.EmployeeList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
public class SupplierMain {
    private static String createRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+{}[]|;:<>,.?/~";
        StringBuilder passcode = new StringBuilder();
        Random rd = new Random();
        for (int i = 0; i < length; i++) {
            int rdIndex = rd.nextInt(characters.length());
            passcode.append(characters.charAt(rdIndex));
        }
        return passcode.toString();
    }
    public static List<User> createUsers(List<Employee> employees, Supplier<String> passcodeRandom) {
        List<User> users = new ArrayList<>();
        for (Employee employee : employees) {
            String userName = employee.getFirstName() + employee.getLastName() + employee.getDateOfBirth() + employee.getId();
            String password = passcodeRandom.get();
            users.add(new User(userName, password));
        }
        return users;
    }
    public static void main(String[] args) {
        EmployeeList el = new EmployeeList();
        //list of users from list of employees
        List<User> users = createUsers((List<Employee>) el.getE(), () -> createRandomPassword(16));
        // Print users
        for (User u : users) {
            System.out.println("Username: " + u.userName + ", Password: " + u.password);
        }
    }
}