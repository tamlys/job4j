package ru.job4j.calculator;
/**
 * Calculate
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
    /**
     * Add values, first + second.
     * @param first - first value.
     * @param second - second value.
     * @return - add first and second
     */
    public double add(double first, double second) {
        return first + second;
    }
    /**
     * Subtract values, first - second.
     * @param first - first value.
     * @param second - second value.
     * @return - subtract first and second
     */
    public double subtract(double first, double second) {
        return  first - second;
    }
    /**
     * Div values, first/second.
     * @param first - first value.
     * @param second - second value.
     * @return - div first and second
     */
    public double div(double first, double second) {
        return first / second;
    }
    /**
     * Multiple values, first*second.
     * @param first - first value.
     * @param second - second value.
     * @return - multiple first and second
     */
    public double multiple(double first, double second) {
        return first * second;
    }
}