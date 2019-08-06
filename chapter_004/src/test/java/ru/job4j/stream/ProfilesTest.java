package ru.job4j.stream;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * ProfilesTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class ProfilesTest {
    @Test
    public void whenProfilesToAddress() {
        Profiles pr = new Profiles();
        Address penza1 = new Address("penza", "pyshkina", 1, 440);
        Address penza2 = new Address("penza", "pyshkina", 2, 10);
        Address saransk = new Address("saransk", "gardeeva", 50, 1);
        Address moscow = new Address("moscow", "centralnaya", 12, 5);
        Profile max = new Profile(penza1);
        Profile denis = new Profile(penza2);
        Profile oleg = new Profile(saransk);
        Profile alex = new Profile(moscow);
        List<Profile> profiles = List.of(max, denis, oleg, alex);
        List<Address> address = List.of(moscow, penza1, penza2, saransk);
        assertThat(address, is(pr.collect(profiles)));



    }
}
