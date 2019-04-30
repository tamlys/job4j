package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * PointTest
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {

    /**
     * Distance point between other point
     */
    @Test
    public void whenZeroAndTenThenTen() {
        Point point = new Point();
        double result = point.distance(0, 0, 0, 10);
        assertThat(result, is(10D));
    }
}