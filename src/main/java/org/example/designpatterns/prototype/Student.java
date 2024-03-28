package org.example.designpatterns.prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batchName;
    private double avgBatchPsp;
    private double psp;

    Student() {}
    Student(Student st) {
        this.name = st.name;
        this.age = st.age;
        this.psp = st.psp;
        this.avgBatchPsp = st.avgBatchPsp;
        this.batchName = st.batchName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchName='" + batchName + '\'' +
                ", avgBatchPsp=" + avgBatchPsp +
                ", psp=" + psp +
                '}';
    }
}
