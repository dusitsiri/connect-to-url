package lab8unittest;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        Student tiger = new Student("tiger", "11");
        Student pat = new Student("pat", "12");
        classroom.addStudent(tiger);
        classroom.addScoreById("12", 10);
    }
}
