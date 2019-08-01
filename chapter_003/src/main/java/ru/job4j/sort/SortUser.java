package ru.job4j.sort;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 * SortUser
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 01.08.19
 */
public class SortUser {
    public Set<User> sort(List<User> list) {
        Set<User> result = new TreeSet<>();
        for (User users : list) {
            result.add(users);
        }
        return result;
    }
}
