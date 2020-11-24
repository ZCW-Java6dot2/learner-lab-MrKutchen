package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ZipCodeWilmingtonTest {

    String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };

    @Before
    public void setUp() {
        ZipCodeWilmington.fireStaff();
    }

    @Test
    public void testHire() {
        //Given
        //When
        for (String i : instructorNames) {
            Instructor instructor = new Instructor(i);
            ZipCodeWilmington.hire(instructor);
        }

        //Then
        Assert.assertFalse(ZipCodeWilmington.getInstructorList().isEmpty());
        Assert.assertEquals(instructorNames.length, ZipCodeWilmington.getInstructorList().size());
    }

    @Test
    public void testFireStaff() {
        Assert.assertTrue(ZipCodeWilmington.getInstructorList().isEmpty());
    }
}
