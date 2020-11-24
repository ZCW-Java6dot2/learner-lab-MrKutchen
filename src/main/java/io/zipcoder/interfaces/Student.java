package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private Double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }


    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }

}
