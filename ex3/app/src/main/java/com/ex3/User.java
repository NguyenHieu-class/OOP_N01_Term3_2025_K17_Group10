package com.ex3;

public class User {
    private String name;
    private String role;
    private int age;

    public User() {}

    public User(String name, String role, int age) {
        this.name = name;
        this.role = role;
        this.age = age;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("User: " + name + ", Role: " + role + ", Age: " + age);
    }
}

