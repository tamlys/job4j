package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ArrayDuplicateTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicateTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        ArrayDuplicate arDup = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] result = arDup.remove(input);
        String[] expect = new String[]{"Привет", "Мир", "Супер"};
        assertThat(result, is(expect));
    }
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray1() {
        ArrayDuplicate arDup = new ArrayDuplicate();
        String[] input = new String[]{"Привет", "Мир", "Привет", "Супер", "Мир", "Машина", "Вертолет", "Вертолет", "Паровоз", "Машина"};
        String[] result = arDup.remove(input);
        String[] expect = new String[]{"Привет", "Мир", "Машина", "Супер", "Паровоз", "Вертолет"};
        assertThat(result, is(expect));
    }
}
