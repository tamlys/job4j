package ru.job4j.stream;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Student
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> result = profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
        return result;
    }
}
