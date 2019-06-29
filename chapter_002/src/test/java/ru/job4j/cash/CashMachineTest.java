package ru.job4j.cash;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * cash
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class CashMachineTest {
    @Test
    public void whenValue100Price35() {
            CashMachine cm = new CashMachine();
            int[] result = cm.changes(100, 35);
            int[] expect = {6, 1, 0, 0};
            assertThat(result, is(expect));
        }
    }
