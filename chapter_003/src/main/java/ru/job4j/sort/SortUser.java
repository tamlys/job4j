package ru.job4j.sort;
import java.util.*;
/**
 * SortUser
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 01.08.19
 */
public class SortUser {
    /**
     * Метод sort
     * @param list список пользователей
     * @return возвращает список пользователей, отсортированных по возрасту
     */
    public Set<User> sort(List<User> list) {
        Set<User> result = new TreeSet<>();
        for (User users : list) {
            result.add(users);
        }
        return result;
    }
    /**
     * Метод sortNameLength
     * @param list список пользователей
     * @return возвращает список пользователей, отсортированных по длине
     */
    public List<User> sortNameLength(List<User> list) {
        List<User> result = new ArrayList<>(list);
        result.sort(new UserComparator());
        return result;
    }
    /**
     * Метод sortByAllFields
     * @param list список пользователей
     * @return возвращает список пользователей, отсортированных сначала по длине имен, а затем по возрасту
     */
    public List<User> sortByAllFields(List<User> list) {
        List<User> result = new ArrayList<>(list);
        result.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result == 0) {
                    result = Integer.compare(o1.getAge(), o2.getAge());
                }
                return result;
            }
        });
        return result;
    }
}
