package org.example.designpatterns.prototype;

public class Client {

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student mar24LLDEvePrototype = new Student();
        mar24LLDEvePrototype.setBatchName("Mar24LLDEve");
        mar24LLDEvePrototype.setAvgBatchPsp(80.0);

        studentRegistry.register("mar24LLDEve", mar24LLDEvePrototype);

        Student feb24LLDEvePrototype = new Student();
        feb24LLDEvePrototype.setBatchName("Feb24LLDEve");
        feb24LLDEvePrototype.setAvgBatchPsp(75.0);

        studentRegistry.register("feb24LLDEve", feb24LLDEvePrototype);

        IntelligentStudent mar24LLDEveISPrototype = new IntelligentStudent();
        mar24LLDEveISPrototype.setBatchName("Mar24LLDEve");
        mar24LLDEveISPrototype.setAvgBatchPsp(80.0);
        mar24LLDEveISPrototype.iq = 100;
        studentRegistry.register("mar24EveIS", mar24LLDEveISPrototype);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student raj = studentRegistry.get("mar24LLDEve").clone();
        raj.setName("Raj Kumar");
        raj.setAge(25);
        raj.setPsp(91.47);

        Student rajIS = studentRegistry.get("mar24EveIS").clone();
        rajIS.setName("Raj Kumar IS");
        rajIS.setAge(27);
        rajIS.setPsp(98.1);

        System.out.println("DEBUG");

    }
}
