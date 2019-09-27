package ru.job4j.list;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * LinkedNodeCycleTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 27.09.19
 */
public class LinkedNodeCycleTest {
    @Test
    public void whenListIsCycleThanTrue() {
        LinkedNodeCycle list = new LinkedNodeCycle();
        list.cycle();
        assertThat(list.hasCycle(list.getFirst()), is(true));
    }
}
