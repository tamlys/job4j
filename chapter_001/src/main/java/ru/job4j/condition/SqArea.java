package ru.job4j.condition;
/**
 * SqArea
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SqArea {
    /**
     *
     * @param p - p.
     * @param k - k.
     * @return s.
     */
    public static int square(int p, int k) {
        int h, w, s;
        w = p / (2 + 2 * k);
        h = w * k;
        s = w * h;
        return s;
    }
}

