package org.example;

import org.example.training.exo1.solution.SaveUser;
import org.example.training.exo1.solution.User;

public class Main {
    public static void main(String[] args) {
        SaveUser saveUser = new SaveUser();
        User user = new User.Builder().name("ben").password("bena").age(19).build();

        saveUser.SaveUserIn(user);

    }
}