package ru.job4j.condition;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
/**
 * SqAreaTest
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class SqAreaTest {
    /**
     * value square, if  p = 4 k = 1 s = 1.
     */
    @Test
    public void p4k1s1() {
        assertThat(SqArea.square(4, 1), is(1));
    }
    /**
     * value square, if p = 6 k = 2 s = 2.
     */
    @Test
    public void p6k2s2() {
        assertThat(SqArea.square(6, 2), is(2));
    }
}