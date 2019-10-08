package ru.job4j.map;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
/**
 * UserTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 08.10.19
 */
public class UserTest {

    @Test
    public void whenNotOverrideEqualsAndHashcode() {
        Calendar calendar = new GregorianCalendar(1996, 2, 25);
        User max1 = new User("Maxim", 0, calendar);
        User max2 = new User("Maxim", 0, calendar);
        Map<User, Object> map = new HashMap<>();
        map.put(max1, new Object());
        map.put(max2, new Object());
        for (User user : map.keySet()) {
            System.out.println(user);
        }
        System.out.println(max1.hashCode());
        System.out.println(max2.hashCode());
    }

}
