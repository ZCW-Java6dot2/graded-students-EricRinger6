package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;


public class ClassroomTest {

    @Test
    public void testStudentAdd(){
        Classroom classroom = new Classroom();
        String actual = "Freddy";
        Student add = new Student(actual, "Fazzbear", new Double[1]);

        classroom.addStudent(add);

        Student expected = classroom.getStudents().get(0);

        Assert.assertEquals(actual, expected.getFirstName());

    }

    @Test
    public void testGetSetMaxNum(){
        Integer actual = 20;

        Classroom classroom = new Classroom();

        classroom.setMaxNumOfStudents(actual);
        Integer expected = classroom.getMaxNumOfStudents();

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testGradeBook(){
        ArrayList<Double> arr1 = new ArrayList<>(10);
        ArrayList<Double> arr2 = new ArrayList<>(10);
        ArrayList<Double> arr3 = new ArrayList<>(10);

        Student s1 = new Student("Fred", "Fazz", arr1.toArray(new Double[10]));
        Student s2 = new Student("Human", "Being", arr2.toArray(new Double[10]));
        Student s3 = new Student("Darth", "Pelagius", arr3.toArray(new Double[10]));

        s1.addExamScore(100.00);
        s2.addExamScore(00.00);
        s3.addExamScore(33.00);

        ArrayList<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Classroom classroom = new Classroom();
        HashMap<Student, String> hasMap = classroom.getGradeBook();
        Boolean expected = hasMap.containsValue("A");
        Boolean actual = false;

        Assert.assertEquals(expected, actual);

    }

}
