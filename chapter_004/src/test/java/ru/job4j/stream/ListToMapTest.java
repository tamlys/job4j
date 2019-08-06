package ru.job4j.stream;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * ListToMapTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class ListToMapTest {
    @Test
    public void whenConvertListToMap() {
        ListToMap ltm = new ListToMap();
        School school = new School();
        Student max = new Student(20, "Savenkov");
        Student oleg = new Student(20, "Vasykov");
        Student alex = new Student(60, "Dergynov");
        Student alexander = new Student(65, "Ivleev");
        Student misha = new Student(80, "Ivanov");
        Student dima = new Student(90, "Petrov");
        List<Student> students = List.of(max, oleg, alex, alexander, misha, dima);
        Map<String, Student> res = ltm.convert(students);
        Map<String, Student> expected = Map.of(
                max.getSecondName(), max,
                oleg.getSecondName(), oleg,
                alex.getSecondName(), alex,
                alexander.getSecondName(), alexander,
                misha.getSecondName(), misha,
                dima.getSecondName(), dima
        );
        assertThat(expected, is(res));
    }
}
