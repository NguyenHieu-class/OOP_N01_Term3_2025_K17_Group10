package com.ex3;

public class TestTime {
    public static void runTest() {
        System.out.println("== Test constructor Time() ==");
        Time t1 = new Time();
        System.out.println("Expected: 12:00:00 AM -> " + t1.toString());

        System.out.println("\n== Test constructor Time(13) ==");
        Time t2 = new Time(13);
        System.out.println("Expected: 1:00:00 PM -> " + t2.toString());

        System.out.println("\n== Test constructor Time(9, 45) ==");
        Time t3 = new Time(9, 45);
        System.out.println("Expected: 9:45:00 AM -> " + t3.toString());

        System.out.println("\n== Test constructor Time(22, 30, 15) ==");
        Time t4 = new Time(22, 30, 15);
        System.out.println("Expected: 10:30:15 PM -> " + t4.toString());

        System.out.println("\n== Test setTime() ==");
        t4.setTime(5, 5, 5);
        System.out.println("Expected: 5:05:05 AM -> " + t4.toString());

        System.out.println("\n== Test invalid values ==");
        Time t5 = new Time(25, 70, 99); // invalid hour, minute, second
        System.out.println("Expected: 12:00:00 AM -> " + t5.toString());

        System.out.println("\n== Test getters ==");
        System.out.println("Hour: " + t3.getHour());
        System.out.println("Minute: " + t3.getMinute());
        System.out.println("Second: " + t3.getSecond());
    }
}
