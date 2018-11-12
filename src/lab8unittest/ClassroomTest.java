package lab8unittest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ClassroomTest {
    private Student student,student1,student2;
    private static double score1,score2,score3;
    private static String id;
    private static Classroom classroom;

    @BeforeAll
    static void setUp() {
        score1 = 15;
        score2 = 16;
        score3 = 17;
        id = "1";
    }

    @BeforeEach
    void init() {
        classroom = new Classroom();
        student = new Student("tiger", "1");
        student1 = new Student("pat", "2");
        student2 = new Student("joe", "3");
        classroom.addStudent(student);
    }

    @Test
    void addStudent() {
        assertEquals(1,classroom.size());
    }

    @Test
    void addScoreById() {
        classroom.addScoreById(id,score1);
    }

    @Test
    void getScoreById() {
        classroom.addScoreById(id,score1);
        assertEquals(score1, classroom.getScoreById(id));
    }

    @Test
    void averageScore() {
        classroom.addScoreById(id,score1);
        assertEquals(15, classroom.averageScore());
    }

    @Test
    void totalScore() {
        classroom.addScoreById(id,score1);
        classroom.addScoreById(id,score2);
        assertEquals(score1+score2, classroom.totalScore());
    }

    @Test
    void size() {
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        assertEquals(3, classroom.size());
    }
}