package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("BryanMatta", new Student("Bryan Matta"));
        students.put("JustinLife", new Student("Allen-Justin Blanco"));
        students.put("MooreProblems", new Student("Rob Moore"));
        students.put("Dr.Carranza", new Student("Mike Carranza"));

        students.get("BryanMatta").addGrade(100);
        students.get("BryanMatta").addGrade(95);
        students.get("BryanMatta").addGrade(85);

        students.get("JustinLife").addGrade(100);
        students.get("JustinLife").addGrade(100);
        students.get("JustinLife").addGrade(100);

        students.get("MooreProblems").addGrade(94);
        students.get("MooreProblems").addGrade(95);
        students.get("MooreProblems").addGrade(90);

        students.get("Dr.Carranza").addGrade(82);
        students.get("Dr.Carranza").addGrade(79);
        students.get("Dr.Carranza").addGrade(85);

        for(String username : students.keySet()){
            System.out.println("Username: " + username + " Student: " + students.get(username).getName() + " Grade: " + students.get(username).getGradeAverage());
        }
        System.out.println(students.keySet());
    }
}
