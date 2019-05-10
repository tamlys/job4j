package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ArrayCharTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ArrayCharTest {
    /**
     * whenStartWithPrefixThenTrue
     * Проверяем, если слово начинается с префикса "He", возвращаем true, иначе false
     */
    @Test
    public void whenStartWithPrefixThenTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("He");
        assertThat(result, is(true));
    }
    /**
     * whenStartWithPrefixThenTrue
     * Проверяем, если слово начинается с префикса "Hi", возвращаем true, иначе false
     */
    @Test
    public void whenNotStartWithPrefixThenFalse() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hi");
        assertThat(result, is(false));
    }
    /**
     * whenStartWithPrefixThenTrue
     * Проверяем, если слово начинается с префикса "Hell", возвращаем true, иначе false
     */
    @Test
    public void whenStartWithPrefixThenAllTrue() {
        ArrayChar word = new ArrayChar("Hello");
        boolean result = word.startWith("Hell");
        assertThat(result, is(true));
    }
}
