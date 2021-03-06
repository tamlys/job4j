package ru.job4j.tracker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * StartUITest
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StartUITest {
    private PrintStream stdout = System.out;
    private ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final Consumer<String> output = new Consumer<String>() {
        private final PrintStream stdout = new PrintStream(out);

        @Override
        public void accept(String s) {
            stdout.println(s);
        }
    };
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }
    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }
    public String getMenu() {
        return new StringBuilder()
                .append("0 - Добавить новую запись.")
                .append(System.lineSeparator())
                .append("1 - Показать все записи.")
                .append(System.lineSeparator())
                .append("2 - Редактировать запись.")
                .append(System.lineSeparator())
                .append("3 - Удалить запись.")
                .append(System.lineSeparator())
                .append("4 - Найти запись по ID.")
                .append(System.lineSeparator())
                .append("5 - Найти запись по имени.")
                .append(System.lineSeparator())
                .append("6 - Выйти из программы.")
                .append(System.lineSeparator())
                .toString();
    }
    @Test
    public void getAllItems() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Name1", "Desc1", 1L));
        Input input = new StubInput(new String[] {"1", "6"});
        new StartUI(input, tracker, output).init();
        assertThat(this.out.toString(),
                is(
                    new StringBuilder()
                        .append(getMenu())
                        .append("[Item{ ")
                        .append("id = ")
                        .append("'" + item.getId() + "',")
                        .append(" name = ")
                        .append("'" + item.getName() + "',")
                        .append(" desc = ")
                        .append("'" + item.getDesc() + "',")
                        .append(" time = ")
                        .append(item.getTime())
                        .append(" } ]")
                        .append(System.lineSeparator())
                        .append(getMenu())
                        .append("До скорых встреч")
                        .append(System.lineSeparator())
                        .toString()
                )
        );
    }
    @Test
    public void whenUserFindItemByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Name1", "Desc1", 1L));
        Input input = new StubInput(new String[] {"5", "Name1", "6"});
        new StartUI(input, tracker, output).init();
        assertThat(this.out.toString(),
                is(
                        new StringBuilder()
                                .append(getMenu())
                                .append("[Item{ ")
                                .append("id = ")
                                .append("'" + item.getId() + "',")
                                .append(" name = ")
                                .append("'" + item.getName() + "',")
                                .append(" desc = ")
                                .append("'" + item.getDesc() + "',")
                                .append(" time = ")
                                .append(item.getTime())
                                .append(" } ]")
                                .append(System.lineSeparator())
                                .append(getMenu())
                                .append("До скорых встреч")
                                .append(System.lineSeparator())
                                .toString()
                ));
    }
    @Test
    public void whenUserFindItemByID() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Name1", "Desc1", 1L));
        Input input = new StubInput(new String[] {"4", item.getId(), "6"});
        new StartUI(input, tracker, output).init();
        assertThat(this.out.toString(),
                is(
                        new StringBuilder()
                                .append(getMenu())
                                .append("Item{ ")
                                .append("id = ")
                                .append("'" + item.getId() + "',")
                                .append(" name = ")
                                .append("'" + item.getName() + "',")
                                .append(" desc = ")
                                .append("'" + item.getDesc() + "',")
                                .append(" time = ")
                                .append(item.getTime())
                                .append(" } ")
                                .append(System.lineSeparator())
                                .append(getMenu())
                                .append("До скорых встреч")
                                .append(System.lineSeparator())
                                .toString()
                ));
    }

    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[] {"0", "test name", "desc", "6"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findAll(), is(tracker.findByName("test name")));
    }
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 12L));
        Input input = new StubInput(new String[] {"2", item.getId(), "test replace", "заменили заявку", "6"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findAll(), is(tracker.findByName("test replace")));
    }
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 12L));
        Input input = new StubInput(new String[] {"3", item.getId(), "6"});
        new StartUI(input, tracker, output).init();
    }
    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("test name", "desc", 12L));
        Input input = new StubInput(new String[] {"4", item.getId(), "6"});
        new StartUI(input, tracker, output).init();
        String expected = "test name";
        assertThat(tracker.findById(item.getId()), is(item));
    }
    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Max", "desc", 123L));
        Input input = new StubInput(new String[] {"5", item.getName(), "6"});
        new StartUI(input, tracker, output).init();
        assertThat(tracker.findByName(item.getName()), is(tracker.findByName("Max")));
    }
}

