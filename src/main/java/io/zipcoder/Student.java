package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {

    private String firstName = "";
    private String lastName = "";
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
        ArrayList<Double> list = new ArrayList<Double>(Arrays.asList(examScores));
        this.examScores = list;
    }

    public Student(){

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    public ArrayList<Double> getExamScores(){
        return examScores;
    }

    public String getExamScoresStr(ArrayList<Double> examScores) {
        String[] output = {""};
        int[] i = {1};
        examScores.forEach((temp) -> {
            output[0] = "Exam " + i[0] + " -> " + temp;
            i[0]++;
        });
        return output[0];
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void addExamScore(Double examScore){
        this.examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        examScores.set(examNumber, newScore);
    }

    public Double getAverageExamScore(){
        double sum = examScores.stream().mapToDouble(temp -> temp).sum();
        return sum / examScores.size();
    }

    @Override
    public String toString(){

        return "Student Name: " + firstName + " " + lastName + "\nAverage Score: " +
                getAverageExamScore() + "\n" + getExamScoresStr(examScores);

    }

}
