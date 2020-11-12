package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Classroom {

    private ArrayList<Student> students;
    private Integer maxNumOfStudents = 0;

    public Classroom(){
        this.students = new ArrayList<Student>(30);
    }

    public Classroom(Integer maxNumOfStudents){
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public Classroom(ArrayList<Student> students){
        this.students = students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Integer getMaxNumOfStudents() {
        return maxNumOfStudents;
    }

    public void setMaxNumOfStudents(Integer maxNumOfStudents) {
        this.maxNumOfStudents = maxNumOfStudents;
    }

    public Double getAverageExamScore(){
        Double sum = 0.00;

        for (Student student: students) {
            sum += student.getAverageExamScore();
        }

        return sum / students.size();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(String firstName, String lastName){
        students.forEach((s) -> {
            if(s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)){
                students.remove(s);
            }
        });
    }

    public void getStudentsByScore(){
        Collections.sort((List) students);
    }

    public HashMap<Student, String> getGradeBook(){
        HashMap<Student, String> map = new HashMap<>();

        students.forEach((student) -> {
            Double swit = student.getAverageExamScore() / 100 * (students.size() + 1);
            if(swit < 10){
                map.put(student, "A");
            }
            else if(swit > 11 && swit < 29){
                map.put(student, "B");
            }
            else if(swit > 30 && swit < 50){
                map.put(student, "C");
            }
            else if(swit > 51 && swit < 89){
                map.put(student, "D");
            }
            else{
                map.put(student, "F");
            }
        });
        return map;
    }


}
