package ru.job4j.condition;
/**
 * SqArea
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SqArea {
    /**
     * Method height
     * @param w - w.
     * @param k - k.
     * @return value height.
     */
    public static int height(int w, int k) {
        return w * k;
    }
    /**
     * Method perimetr
     * @param w - w.
     * @param h - h.
     * @return value perimetr.
     */
    public static int perimetr(int w, int h) {
        return 2 * (w + h);
    }
    /**
     * Method weight
     * @param h - h.
     * @param k - k.
     * @return value weight.
     */
    public static int weight(int h, int k) {
        return h / k;
    }
    /**
     * Method square
     * @param w - w.
     * @param h - h.
     * @return value square.
     */
    public static int square(int w, int h) {
        return w * h;
    }
}
