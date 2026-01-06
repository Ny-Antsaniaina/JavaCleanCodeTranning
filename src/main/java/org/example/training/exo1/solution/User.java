package org.example.training.exo1.solution;

public class User {
    private final String name;
    private final String password;
    private final int  age;

    public User(Builder builder) {
        this.name = builder.name;
        this.password = builder.password;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public int getAge() {
        return age;
    }

    public static class Builder {
        private String name;
        private String password;
        private int age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }


        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
  }
}
