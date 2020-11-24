package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest extends TestCase {


    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor(1, "Chris");
        Student student = new Student(1, "Kyle");
        Double expectedTotalStudyTime = 100.00;
        //When
        instructor.teach(student, expectedTotalStudyTime);
        Double actualTotalStudyTime = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime);
    }

    @Test
    public void testLecture() {
        //Given
        Student[] students = new Student[3];
        Instructor instructor = new Instructor(1, "Chris");
        Student student1 = new Student(1, "Kyle");
        Student student2 = new Student(2, "Peter");
        Student student3 = new Student(3, "Amanda");
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        Double expectedTotalStudyTime = 100.00;
        //When
        instructor.lecture(students, expectedTotalStudyTime);
        Double actualTotalStudyTime1 = students[0].getTotalStudyTime();
        Double actualTotalStudyTime2 = students[1].getTotalStudyTime();
        Double actualTotalStudyTime3 = students[2].getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime1);
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime2);
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime3);
    }

    @Test
    public void testImplementation() {
        //Given
        //When
        Instructor instructor = new Instructor(1, "Dolio");
        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        //When
        Instructor instructor = new Instructor(1, "Dolio");
        //Then
        Assert.assertTrue(instructor instanceof Person);
    }
}