package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * TriangleTest
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TriangleTest {
    @Test
    public void triangleArea() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertThat(result, closeTo(0.1, 2D));
    }
}