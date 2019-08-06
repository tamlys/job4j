package ru.job4j.stream;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
/**
 * School
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predicate) {
        List<Student> result = students.stream().filter(predicate).collect(Collectors.toList());
        return result;
    }
}