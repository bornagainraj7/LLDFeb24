package org.example.designpatterns.builder;

public class Student {
    String name;
    int age;
    double psp;
    String batch;
    int gradYear;
    String phoneNumber;

    // private Student() {}

    private Student (Builder builder) {
        this.age = builder.getAge();
        this.name = builder.getName();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.phoneNumber = builder.getPhoneNumber();
    }

    public static Builder getBuilder() {
        return new Builder();
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", batch='" + batch + '\'' +
                ", gradYear=" + gradYear +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static class Builder { // Inner class or nested class
        String name;
        int age;
        double psp;
        String batch;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public int getGradYear() {
            return gradYear;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build() {
            if (this.getAge() < 21) {
                throw new RuntimeException("Age cannot be less than 21");
            }

            if (this.getGradYear() > 2023) {
                throw new RuntimeException("Grad year cannot be later then 2023");
            }

            return new Student(this);
        }

    }

}
