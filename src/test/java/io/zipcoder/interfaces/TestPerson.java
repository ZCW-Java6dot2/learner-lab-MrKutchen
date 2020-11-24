package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        //Given
        long expectedId = 1;
        String expectedName = "Peter";
        //When
        Person person = new Person("Peter");
        String actualName = person.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        //Given
        Person person = new Person( "Peter");
        String expectedName = "Andrew";
        //When
        person.setName("Andrew");
        String actualName = person.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);
    }
}
