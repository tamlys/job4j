package ru.job4j.stream;
/**
 * Profile
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class Profile {
    private Address address;
    public Profile(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
}
