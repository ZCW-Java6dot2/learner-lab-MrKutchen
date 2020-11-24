package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest extends TestCase {


    @Test
    public void testTeach() {
        //Given
        Instructor instructor = new Instructor("Chris");
        Student student = new Student("Kyle");
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
        Student[] students = new Student[1];
        Instructor instructor = new Instructor("Chris");
        Student student1 = new Student("Kyle");
        students[0] = student1;
        Double expectedTotalStudyTime = 100.00;
        //When
        instructor.lecture(students, expectedTotalStudyTime);
        Double actualTotalStudyTime1 = students[0].getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime1);
    }

    @Test
    public void testImplementation() {
        //Given
        //When
        Instructor instructor = new Instructor("Dolio");
        //Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance() {
        //Given
        //When
        Instructor instructor = new Instructor("Dolio");
        //Then
        Assert.assertTrue(instructor instanceof Person);
    }
}