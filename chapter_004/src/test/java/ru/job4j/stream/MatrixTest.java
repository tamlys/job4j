package ru.job4j.stream;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * MatrixTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class MatrixTest {
    @Test
    public void convertMatrixToList() {
        Matrix mx = new Matrix();
        Integer[][] matrix = new Integer[][] {{1, 2}, {3, 4}};
        List<Integer> expected = List.of(1, 2, 3, 4);
        assertThat(expected, is(mx.convertMatrixToList(matrix)));
    }
}
