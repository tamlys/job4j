package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerInstanceTest {
    @Test
    public void whenTrackerEnumTest() {
       TrackerEnum tracker = TrackerEnum.INSTANCE;
       long created = System.currentTimeMillis();
       Item item = new Item("name", "desc", created);
       tracker.add(item);
       assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void whenTrackerEangerLoadingTest() {
        TrackerEagerLoading tracker = TrackerEagerLoading.getInstance();
        long created = System.currentTimeMillis();
        Item item = new Item("name", "desc", created);
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void whenTrackerFinalLazyLoadingTest() {
        TrackerFinalLazyLoading tracker = TrackerFinalLazyLoading.getInstance();
        long created = System.currentTimeMillis();
        Item item = new Item("name", "desc", created);
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void whenTrackerTrackerLazyLoadingTest() {
        TrackerLazyLoading tracker = TrackerLazyLoading.getInstance();
        long created = System.currentTimeMillis();
        Item item = new Item("name", "desc", created);
        tracker.add(item);
        assertThat(tracker.findById(item.getId()), is(item));
    }
}
