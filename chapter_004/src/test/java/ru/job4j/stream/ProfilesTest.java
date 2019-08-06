package ru.job4j.stream;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * SchoolTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class ProfilesTest {
    @Test
    public void whenProfilesToAddress() {
        Profiles pr = new Profiles();
        Address penza = new Address("penza", "pyshkina", 1, 440);
        Address saransk = new Address("saransk", "gardeeva", 50, 1);
        Address moscow = new Address("moscow", "centralnaya", 12, 5);
        Profile max = new Profile(penza);
        Profile oleg = new Profile(saransk);
        Profile alex = new Profile(moscow);
        List<Profile> profiles = List.of(max, oleg, alex);
        List<Address> address = List.of(penza, saransk, moscow);
        assertThat(address, is(pr.collect(profiles)));



    }
}
