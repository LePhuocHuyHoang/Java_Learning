package main;

public class Exeption {
    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age > 120) {
            throw new IllegalArgumentException("Invalid age value");
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        int age = -5;
        try {
            validateAge(age);
        } catch (IllegalArgumentException ex) {
            System.out.println("Invalid age: " + ex.getMessage());
        }
    }
}
