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
            int[] expect = {10, 10, 10, 10, 10, 10, 5};
            assertThat(result, is(expect));
    }
    @Test
    public void whenValue70Price35() {
        CashMachine cm = new CashMachine();
        int[] result = cm.changes(70, 35);
        int[] expect = {10, 10, 10, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenValue50Price35() {
        CashMachine cm = new CashMachine();
        int[] result = cm.changes(50, 35);
        int[] expect = {10, 5};
        assertThat(result, is(expect));
    }
}