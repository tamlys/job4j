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
    public void whenAddUsers() {
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
}
