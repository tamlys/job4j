package ru.job4j.sort;
/**
 * User
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 01.08.19
 */
public class User implements Comparable<User> {
    private String name;
    private Integer age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public Integer getAge() {
        return this.age;
    }
    @Override
    public int compareTo(User o) {
        return this.age.compareTo(o.age);
    }
}
