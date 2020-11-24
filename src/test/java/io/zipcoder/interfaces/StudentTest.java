package io.zipcoder.interfaces;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class StudentTest extends TestCase {

    @Test
    public void testLearn() {
        //Given
        Student student = new Student("Peter");
        Double expectedTotalStudyTime = 100.00;
        //When
        student.learn(expectedTotalStudyTime);
        Double actualTotalStudyTime = student.getTotalStudyTime();
        //Then
        Assert.assertEquals(expectedTotalStudyTime, actualTotalStudyTime);
    }

    @Test
    public void implementationTest() {
        //Given
        //When
        Student student = new Student(null);
        //Then
        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance() {
        //Given
        //When
        Student student = new Student(null);
        //Then
        Assert.assertTrue(student instanceof Person);
    }
}