package com.ex3;

public class TestUser {
    public static void runTest() {
        User user = new User("Dr. Thanh", "Ambulance Coordinator", 45);
        user.displayInfo();
        user.setAge(46);
        System.out.println("Updated age: " + user.getAge());
    }
}
