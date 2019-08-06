package ru.job4j.stream;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Profiles
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class Profiles {
    public List<Address> collect(List<Profile> profiles) {
        List<Address> result = profiles.stream().map(Profile::getAddress).distinct().sorted(Comparator.comparing(Address::getCity)).collect(Collectors.toList());
        return result;
    }
}
