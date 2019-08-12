package ru.job4j.sort;
import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * SortUserTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 01.08.19
 */
public class SortUserTest {
    @Test
    public void whenSortUserByAge() {
        SortUser su = new SortUser();
        User max = new User("Maxim", 21);
        User alex = new User("Alex", 25);
        User ivan = new User("Ivan", 16);
        List<User> list = List.of(max, alex, ivan);
        Set<User> result = su.sort(list);
        Set<User> expected = Set.of(alex, ivan, max);
        assertThat(expected, is(result));
    }
    @Test
    public void whenSortUserByName() {
        SortUser su = new SortUser();
        User max = new User("Maxim", 21);
        User alex = new User("Alex", 25);
        User den = new User("Den", 16);
        List<User> list = List.of(max, alex, den);
        List<User> result = su.sortNameLength(list);
        List<User> expected = List.of(den, alex, max);
        assertThat(expected, is(result));
    }
    @Test
    public void whenSortUserByNameAndAge() {
        SortUser su = new SortUser();
        User max = new User("Maxim", 21);
        User max1 = new User("Maxim", 23);
        User alex = new User("Alex", 25);
        User alex1 = new User("Alex", 20);
        List<User> list = List.of(max, max1, alex, alex1);
        List<User> result = su.sortByAllFields(list);
        List<User> expected = List.of(alex1, alex, max, max1);
        assertThat(expected, is(result));
    }
}
