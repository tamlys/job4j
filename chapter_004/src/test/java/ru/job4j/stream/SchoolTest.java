package ru.job4j.stream;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * SchoolTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class SchoolTest {
    @Test
    public void whenClassA() {
        School school = new School();
        Student max = new Student(10);
        Student oleg = new Student(20);
        Student alex = new Student(60);
        Student alexander = new Student(65);
        Student misha = new Student(80);
        Student dima = new Student(90);
        List<Student> students = new ArrayList<>();
        students.add(max);
        students.add(oleg);
        students.add(alex);
        students.add(alexander);
        students.add(misha);
        students.add(dima);
        List<Student> result = school.collect(students, student -> student.getScore() > 70);
        List<Student> expected = new ArrayList<>();
        expected.add(misha);
        expected.add(dima);
        assertThat(expected, is(result));
    }

    @Test
    public void whenClassB() {
        School school = new School();
        Student max = new Student(10);
        Student oleg = new Student(20);
        Student alex = new Student(60);
        Student alexander = new Student(65);
        Student misha = new Student(80);
        Student dima = new Student(90);
        List<Student> students = new ArrayList<>();
        students.add(max);
        students.add(oleg);
        students.add(alex);
        students.add(alexander);
        students.add(misha);
        students.add(dima);
        List<Student> result = school.collect(students, student -> student.getScore() > 50 && student.getScore() < 70);
        List<Student> expected = new ArrayList<>();
        expected.add(alex);
        expected.add(alexander);
        assertThat(expected, is(result));
    }
    @Test

    public void whenClassC() {
        School school = new School();
        Student max = new Student(10);
        Student oleg = new Student(20);
        Student alex = new Student(60);
        Student alexander = new Student(65);
        Student misha = new Student(80);
        Student dima = new Student(90);
        List<Student> students = new ArrayList<>();
        students.add(max);
        students.add(oleg);
        students.add(alex);
        students.add(alexander);
        students.add(misha);
        students.add(dima);
        List<Student> result = school.collect(students, student -> student.getScore() > 0 && student.getScore() < 50);
        List<Student> expected = new ArrayList<>();
        expected.add(max);
        expected.add(oleg);
        assertThat(expected, is(result));
    }
}
