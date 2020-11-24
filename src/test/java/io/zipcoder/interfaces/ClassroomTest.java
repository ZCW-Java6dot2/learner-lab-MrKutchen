package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ClassroomTest {


    @Test
    public void getRoster() {
        //Given
        //When
        Classroom test = new Classroom();
        ArrayList<Person> people = new ArrayList<Person>(ZipCodeWilmington.getInstructorList().size() + TechConnect.getStudentList().size());
        for (Instructor i: ZipCodeWilmington.getInstructorList()) {
            people.add(i);
        }
        for (Student i: TechConnect.getStudentList()) {
            people.add(i);
        }
        //Then
        Assert.assertTrue(test.getRoster().values().containsAll(people));
    }
}
