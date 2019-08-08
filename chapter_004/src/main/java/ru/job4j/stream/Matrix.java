package ru.job4j.stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Matrix
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class Matrix {
    List<Integer> convertMatrixToList(Integer[][] matrix) {
        return Stream.of(matrix).flatMap(Stream::of).collect(Collectors.toList());
    }
}
