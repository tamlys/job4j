package ru.job4j.stream;
import java.util.Comparator;
/**
 * Student
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 12.08.19
 */
public class Student implements Comparator<Student> {
    private int score;
    private String name;
    private String secondName;

    public Student() {

    }
    public Student(String name, int score) {
        this.score = score;
        this.name = name;
    }

    public Student(int score, String secondName) {
        this.score = score;
        this.secondName = secondName;
    }

    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
    public String getSecondName() {
        return secondName;
    }

    @Override
    public int compare(Student o1, Student o2) {
        int result;
        if ((o1 == null) || (o2 == null)) {
            return 0;
        }
        result = Integer.compare(o2.getScore(), o1.getScore());
        if (result == 0) {
            result = o1.getName().compareTo(o2.getName());
        }
        return result;
    }
}
