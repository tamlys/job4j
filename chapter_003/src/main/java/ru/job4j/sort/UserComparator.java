package ru.job4j.sort;
import java.util.Comparator;
/**
 * UserComparator
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 01.08.19
 */
public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}
