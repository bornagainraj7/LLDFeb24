package org.example.designpatterns.Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry registry) {
        Student mar24LLDEvePrototype = new Student();
        mar24LLDEvePrototype.setBatch("Mar24LLDEve");
        mar24LLDEvePrototype.setAvgBatchPsp(80.0);

        registry.register("Mar24LLDEve", mar24LLDEvePrototype);


        Student feb24LLDEvePrototype = new Student();
        feb24LLDEvePrototype.setBatch("Feb24LLDEve");
        feb24LLDEvePrototype.setAvgBatchPsp(75.5);
        registry.register("Feb24LLDEve", feb24LLDEvePrototype);


        IntelligentStudent mar24LLDEveISPrototype = new IntelligentStudent();
        mar24LLDEveISPrototype.setBatch("Mar24LLDEve");
        mar24LLDEveISPrototype.setAvgBatchPsp(80.0);
        mar24LLDEveISPrototype.iq = 160;
        registry.register("Mar24LLDEveIS", mar24LLDEveISPrototype);
    }
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student raj = registry.get("Mar24LLDEve").clone();
        raj.setName("Rajkumar");
        raj.setPsp(80.5);
        raj.setAge(27);


        Student abhi = registry.get("Mar24LLDEveIS").clone();
        abhi.setName("Abhijeet");
        System.out.println("DEBUG");
    }
}
