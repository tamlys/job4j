package ru.job4j.stream;
/**
 * Student
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class Student {
    private int score;
    private String secondName;

    public Student(int score, String secondName) {
        this.score = score;
        this.secondName = secondName;
    }

    public int getScore() {
        return score;
    }

    public String getSecondName() {
        return secondName;
    }
}
