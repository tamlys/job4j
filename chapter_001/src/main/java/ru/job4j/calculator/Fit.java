package ru.job4j.calculator;
/**
 * Fit
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Fit {

    /**
     * Method manWeight
     * @param height - height of man
     * @return ideal weight of man.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Method manWeight
     * @param height - height of woman
     * @return ideal weight of woman.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

}
