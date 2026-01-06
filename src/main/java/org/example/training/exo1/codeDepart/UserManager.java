package org.example.training.exo1.codeDepart;

public class UserManager {

    public static void main(String[] args) {
        UserManager u = new UserManager();
        u.process("ben", "1234", 19);
        u.process("", "12", 15);
    }

    public void process(String n, String p, int a) {
        if (n != null && !n.equals("") && p != null && p.length() > 3 && a >= 18) {
            System.out.println("User " + n + " created");
        } else {
            System.out.println("Error");
        }
    }
}
