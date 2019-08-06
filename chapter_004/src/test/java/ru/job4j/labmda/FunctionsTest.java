package ru.job4j.labmda;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * FunctionsTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class FunctionsTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Functions.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSqrtFunctionThenLinearResults() {
        List<Double> result = Functions.diapason(2, 5, x -> x * x + 1);
        List<Double> expected = Arrays.asList(5D, 10D, 17D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogFunctionThenLinearResults() {
        List<Double> result = Functions.diapason(3, 6, x -> Math.log(x) + 1);
        List<Double> expected = Arrays.asList(Math.log(3) + 1D, Math.log(4) + 1D, Math.log(5) + 1D);
        assertThat(result, is(expected));
    }
}
