package org.example.designpatterns.Prototype;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent st) {
        this.setName(st.getName());
        this.setAge(st.getAge());
        this.setPsp(st.getPsp());
        this.setBatch(st.getBatch());
        this.setAvgBatchPsp(st.getAvgBatchPsp());
        // if the parent class doesn't provide getters then you can use super(st)
        // super(st);
        this.iq = st.iq;
    }

    @Override
    public Student clone() {
        return new IntelligentStudent(this);
    }
}
