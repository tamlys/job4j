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
        List<User> list = new ArrayList<>();
        User max = new User("Maxim", 21);
        list.add(max);
        User alex = new User("Alex", 25);
        list.add(alex);
        User ivan = new User("Ivan", 16);
        list.add(ivan);
        Set<User> result = su.sort(list);
        Set<User> checkResult = new LinkedHashSet<>();
        checkResult.add(alex);
        checkResult.add(ivan);
        checkResult.add(max);
        assertThat(result, is(checkResult));
    }
    @Test
    public void whenSortUserByName() {
        SortUser su = new SortUser();
        List<User> list = new ArrayList<>();
        User max = new User("Maxim", 21);
        list.add(max);
        User alex = new User("Alex", 25);
        list.add(alex);
        User den = new User("Den", 16);
        list.add(den);
        List<User> result = su.sortNameLength(list);
        List<User> checkResult = new ArrayList<>();
        checkResult.add(den);
        checkResult.add(alex);
        checkResult.add(max);
        assertThat(result, is(checkResult));
    }
    @Test
    public void whenSortUserByNameAndAge() {
        SortUser su = new SortUser();
        List<User> list = new ArrayList<>();
        User max = new User("Maxim", 21);
        list.add(max);
        User max1 = new User("Maxim", 23);
        list.add(max1);
        User alex = new User("Alex", 25);
        list.add(alex);
        User alex1 = new User("Alex", 20);
        list.add(alex1);
        List<User> result = su.sortByAllFields(list);
        List<User> checkResult = new ArrayList<>();
        checkResult.add(alex1);
        checkResult.add(alex);
        checkResult.add(max);
        checkResult.add(max1);
        assertThat(result, is(checkResult));
    }
}
