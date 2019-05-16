package ru.job4j.calculator;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;
/**
 * FitTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com);
 * @version $Id$
 * @since 0.1
 */
public class FitTest {
    /**
     * Search man ideal weight
     */
    @Test
    public void manWeight() {
        Fit fit = new Fit();
        double weight = fit.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }
    /**
     * Search woman ideal weight
     */
    @Test
    public void womanWeight() {
        Fit fit = new Fit();
        double weight = fit.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}
