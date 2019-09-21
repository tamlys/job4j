package ru.job4j.generic;
/**
 * UserStore
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 21.09.19
 */
public class UserStore extends AbstractStore<User> {
    public UserStore(SimpleArray<User> values) {
        super(values);
    }

}
