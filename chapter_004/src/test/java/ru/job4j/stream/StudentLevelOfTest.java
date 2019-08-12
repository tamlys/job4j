package ru.job4j.stream;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.List;
/**
 * StudentLevelOfTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 12.08.19
 */
public class StudentLevelOfTest {
    @Test
    public void whenSortedDeleteNullAndGradeBound() {
        StudentLevelOf slo = new StudentLevelOf();
        Student object1 = new Student("", 90);
        Student object2 = new Student("", 95);
        Student max = new Student("Max", 70);
        Student alex = new Student("Alex", 10);
        Student oleg = new Student("Oleg", 50);
        Student den = new Student("Den", 40);
        Student stas = new Student("Stas", 35);
        Student nikita = new Student("Nikita", 80);
        List<Student> list = List.of(max, alex, oleg, den, stas, nikita);
        List<Student> expected = List.of(nikita, max);
        assertThat(expected, is(slo.levelOf(list, 55)));
    }
}
