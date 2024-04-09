package SupplierPasswordGenerator;

public class User {
    public String userName;
    String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }




    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}