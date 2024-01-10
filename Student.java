package com;

public class Student {
    private String name;
    private int age;
    private String usn;

    // Inner class representing an Address
    private class Address {
        private String street;
        private String city;
        private String state;
        private String zipCode;

        public Address(String street, String city, String state, String zipCode) {
            this.street = street;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        public void displayAddress() {
            System.out.println("Street: " + street);
            System.out.println("City: " + city);
            System.out.println("State: " + state);
            System.out.println("Zip Code: " + zipCode);
            System.out.println("------------------------");
        }
    }

    public Student(String name, int age, String usn, String street, String city, String state, String zipCode) {
        this.name = name;
        this.age = age;
        this.usn = usn;

        // Creating an instance of the Address inner class
        Address studentAddress = new Address(street, city, state, zipCode);
        studentAddress.displayAddress();
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("USN: " + usn);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Creating a new student with associated address
        Student student1 = new Student("John Doe", 20, "ABC123", "123 Main St", "Cityville", "Stateville", "12345");
        student1.displayStudentInfo();

        // Another student with a different address
        Student student2 = new Student("Jane Smith", 22, "XYZ456", "456 Oak St", "Townville", "Stateville", "67890");
        student2.displayStudentInfo();
    }
}
