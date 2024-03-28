package org.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder()
                .setName("Raj")
                .setAge(27)
                .setPsp(90.78)
                .setBatch("May23Int2")
                .setGradYear(2018)
                .setPhoneNumber("9876543210")
                .build();

        // Student s = new Student();
        System.out.println(student.toString());
    }
}
