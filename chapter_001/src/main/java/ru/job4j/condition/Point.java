package ru.job4j.condition;
/**
 * Point
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    /**
     * Method distance
     * @param x1 - x1 coordinate point.
     * @param x2 - x2 coordinate point.
     * @param y1 - y1 coordinate point.
     * @param y2 - y2 coordinate point.
     * @return distance point between other point.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double result = first + second;
        return Math.sqrt(result);
    }
}
