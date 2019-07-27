package ru.job4j.tracker;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * TrackerTest
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class TrackerTest {
    @Test
    public void whenAddNewItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        assertThat(item.getName(), is("test1"));
    }
    @Test
    public void whenReplaceName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()), is(previous));
    }
    @Test
    public void whenFindById() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }
    @Test
    public void whenFindAll() {
        Tracker tracker = new Tracker();
        Item firstItem = new Item("test1", "testDescription", 123L);
        tracker.add(firstItem);
        Item secondItem = new Item("test2", "testDescription2", 1234L);
        tracker.add(secondItem);
        assertThat(tracker.findAll().size(), is(2 ));
    }
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item firstItem = new Item("test1", "testDescription", 12345L);
        tracker.add(firstItem);
        Item secondItem = new Item("test2", "testDescription", 12345L);
        tracker.add(secondItem);
        tracker.delete(firstItem.getId());
        assertThat(tracker.findAll().size(), is(1));
    }
    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item firstItem = new Item("test1", "testDescription", 12345L);
        tracker.add(firstItem);
        Item secondItem = new Item("test2", "testDescription2", 123456L);
        tracker.add(secondItem);
        Item thirdItem = new Item("test2", "testDescription3", 1234567L);
        tracker.add(thirdItem);
        Item fourItem = new Item("test2", "testDescription4", 12345678L);
        tracker.add(fourItem);
        List<Item> result = tracker.findByName("test2");
        assertThat(result.size(), is(3));
    }
}

