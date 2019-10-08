package ru.job4j.map;

import java.util.Calendar;
/**
 * User
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 08.10.19
 */
public class User {
    private String name;
    private int children;
    private Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public int getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name = " + name + " | " + "Children = " + children + " | " + "Birthday = " + birthday;
    }
}
