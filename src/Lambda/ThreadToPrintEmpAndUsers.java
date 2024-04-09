package Lambda;
import ConsumerPredicate.Employee;
import ConsumerPredicate.EmployeeList;
import SupplierPasswordGenerator.User;
import java.util.ArrayList;
import java.util.List;
public class ThreadToPrintEmpAndUsers {
     public static void main(String[] args) {

        EmployeeList el = new EmployeeList();
        List<Employee> emp = el.getE();


        List<User> users = new ArrayList<>();
        users.add(new User("LongBottom" , "hi"));
        users.add(new User("Molly","hello"));
         users.add(new User("Hucrux" , "hi"));
         users.add(new User("SiriusBlack","hello"));

        Thread thread1 = new Thread(() -> empList(emp));
        Thread thread2 = new Thread(() -> userList(users));

        thread1.start();
        thread2.start();
    }

    private static void empList(List<Employee> employees) {

        for (Employee e : employees) {
            System.out.println("Employee List :" + e);
        }
    }

    private static void userList(List<User> users) {
        UserNameGenerator userNameGenerator = (firstName, lastName, yearOfBirth, id) ->
                firstName + lastName+ yearOfBirth + id;

        System.out.println("List of Users:");
        for (User user : users) {

            String userName = userNameGenerator.generateUser(user.userName, "", 0, 0);
            System.out.println("User: " + userName);
        }
    }
}