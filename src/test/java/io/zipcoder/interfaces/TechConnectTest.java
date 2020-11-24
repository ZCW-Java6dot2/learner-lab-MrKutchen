package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TechConnectTest {
    //Given
    String[] studentNames = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
            "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
            "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
            "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
            "Cristine",  "Brendan" };

    @Before
    public void setUp() {
        TechConnect.removeStudents();
    }

    @Test
    public void recruitStudentTest() {
        //Given
        for (String studentName : studentNames) {
            Student student = new Student(studentName);
            TechConnect.getStudentList().add(student);
        }

        //Then
        Assert.assertFalse(TechConnect.getStudentList().isEmpty());
        Assert.assertEquals(TechConnect.getStudentList().size(), studentNames.length);
    }

    @Test
    public void removeStudentsTest() {
        Assert.assertTrue(TechConnect.getStudentList().isEmpty());
    }
}
