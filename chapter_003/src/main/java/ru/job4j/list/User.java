package ru.job4j.list;
/**
 * User
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 23.07.19
 */
public class User {
    private int id;
    private String name;
    private String city;
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}
