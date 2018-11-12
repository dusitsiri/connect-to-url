package lab8unittest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Classroom {
    private Collection<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addScoreById(String id, double score) {
        Iterator<Student> stdItr = students.iterator();
        while (stdItr.hasNext()){
            Student student = stdItr.next();
            String stdId = student.getId();
            if (stdId.equals(id)){
                student.addScore(score);
                System.out.println(student.getId()+" "+student.getScore());
            }
            else if (!stdItr.hasNext()&&!stdId.equals(id)){
                throw new NoSuchElementException("Don't have id: "+id+" in this classroom");
            }
        }
    }

    public double getScoreById(String id) {
        Iterator<Student> stdItr = students.iterator();
        while (stdItr.hasNext()){
            Student student = stdItr.next();
            String stdId = student.getId();
            if (stdId.equals(id)){
               return student.getScore();
            }
            else if (!stdItr.hasNext()&&!stdId.equals(id)){
                throw new NoSuchElementException("Don't have id: "+id+" in this classroom");
            }
        }
        return 0; // ตั้งเป็น default ไม่ให้โปรแกรมทำงานผิดพลาด
    }

    public double averageScore() {
        if (size() > 0){
            return totalScore()/size();
        }
        return 0;
    }

    public double totalScore() {
        double totalScore = 0;
        Iterator<Student> stdItr = students.iterator();
        while (stdItr.hasNext()) {
            Student student = stdItr.next();
            double stdScore = student.getScore();
            totalScore += stdScore;
        }
        return totalScore;
    }

    public int size() {
        return students.size();
    }


}
