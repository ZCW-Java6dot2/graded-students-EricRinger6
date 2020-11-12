package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class StudentTest {

    @Test
    public void testConst(){
        Double[] exam = new Double[2];
        exam[0] = 100.00;
        exam[1] = 140.00;
        Double average = (exam[0] + exam[1]) / 2;
        String actualFName = "Mark";
        String actualLName = "Zucc";

        Student student = new Student(actualFName, actualLName, exam);

        String expectedFName = student.getFirstName();
        String expectedLName = student.getLastName();

        Double expectedAverage= student.getAverageExamScore();

        Assert.assertEquals(expectedFName, actualFName);
        Assert.assertEquals(expectedLName, actualLName);
        Assert.assertEquals(average, expectedAverage);
    }

    @Test
    public void testGetFirstName(){
        Double[] exam = new Double[2];
        exam[0] = 100.00;
        exam[1] = 140.00;

        String actualFName = "Bill";
        String actualLName = "G8s";

        Student student = new Student(actualFName, actualLName, exam);

        String expectedFName = student.getFirstName();

        Assert.assertEquals(expectedFName, actualFName);
    }

    @Test
    public void testSetName(){
        Student student = new Student();

        String actualFName = "Steve";
        String actualLName = "Jahbs";

        student.setFirstName(actualFName);
        student.setLastName(actualLName);

        String expectedFName = student.getFirstName();
        String expectedLName = student.getLastName();

        Assert.assertEquals(expectedFName, actualFName);
        Assert.assertEquals(expectedLName, actualLName);
    }

    @Test
    public void testGetExamScores(){
        Double[] exam = new Double[2];
        exam[0] = 100.00;
        exam[1] = 140.00;

        String actualFName = "Mark";
        String actualLName = "Zucc";

        Student student = new Student(actualFName, actualLName, exam);

        ArrayList<Double> list = new ArrayList<Double>(Arrays.asList(exam));

        Assert.assertEquals(list, student.getExamScores());
    }

    @Test
    public void testAddExam(){//Pretty stuck on this one tbh
        Student student = new Student();

        ArrayList<Double> exam = new ArrayList<>(1);
        exam.set(0, 200.00);

        student.addExamScore(exam.get(0));

        Assert.assertEquals(exam, student.getExamScores());

    }

    @Test
    public void testGetNumOfExams(){
        Double[] exam = new Double[2];
        exam[0] = 100.00;
        exam[1] = 140.00;
        String actualFName = "Frank";
        String actualLName = "Redhot";

        Student student = new Student(actualFName, actualLName, exam);

        Integer actual = exam.length;
        Integer expected = student.getNumberOfExamsTaken();

        Assert.assertEquals(actual, expected);
    }

}