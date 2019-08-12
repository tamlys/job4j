package ru.job4j.stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * StudentLevelOf
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 12.08.19
 */
public class StudentLevelOf {
    /**
     * Метод levelOf
     * @param students список студентов
     * @param bound проходной бал
     * @return список студентов
     */
    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().sorted(new Student()).flatMap(Stream::ofNullable).takeWhile(student -> student.getScore() > bound).collect(Collectors.toList());
    }
}
