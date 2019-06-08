package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * ValidateInputTest
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInput() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.ask("Select", new ArrayList<>(1));
        assertThat(
                this.mem.toString(),
                is(
                        "Даннные введены некоректно, введите еще раз\r\n"
                )
        );
    }

    @Test
    public void whenInputNotRange() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"-1", "1"})
        );
        input.ask("Select", new ArrayList<>(1));
        assertThat(
                this.mem.toString(),
                is(
                        "Не верные данные. Выберите пункт меню от 0 до 6\r\n"
                )
        );
    }
}
