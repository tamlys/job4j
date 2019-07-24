package ru.job4j.list;
import java.util.HashMap;
import java.util.List;
/**
 * UserConvert
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 23.07.19
 */
public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> result = new HashMap<>();
            for (User user : list) {
                result.put(user.getId(), user);
            }
             return result;
    }
}
