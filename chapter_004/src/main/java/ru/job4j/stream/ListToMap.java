package ru.job4j.stream;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * ListToMap
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class ListToMap {
        Map<String, Student> convert(List<Student> students) {
        Map<String, Student> result = students.stream().distinct().collect(Collectors.toMap(Student::getSecondName, student -> student));
        return result;
    }
}
