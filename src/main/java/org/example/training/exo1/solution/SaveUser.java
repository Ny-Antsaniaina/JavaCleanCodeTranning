package org.example.training.exo1.solution;

public class SaveUser {
    public void SaveUserIn(User user){
        String name = user.getName();
        String password = user.getPassword();
        int age = user.getAge();

        if (name == null && name.isBlank()) {
            System.out.println("User " + name + " is empty");
        }else if (password == null && password.equals("") && password.length() < 3 ) {
            System.out.println("User " + name + " password is incorrect!");
        }else if (age < 18){
            System.out.println("User " + name + " age is less than 18!");
        }else {
            System.out.println("User " + name + " is saving!");
        }
    }
}
