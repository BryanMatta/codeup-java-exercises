package grades;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String studentName;
    Student(String name){
        studentName = name;
    }
    private ArrayList<Integer> grades = new ArrayList<>();
    public String getName(){
        return studentName;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double total = 0;
        for (int grade:grades) {
            total+=grade;
        }
        total/=grades.size();
        return total;
    }
}
