package ru.job4j.list;
import org.junit.Test;
import java.util.List;
import java.util.Map;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * UserConvertTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 23.07.19
 */
public class UserConvertTest {
    @Test
    public void listConvertToHashMap() {
     UserConvert userConvert = new UserConvert();
     User max = new User(1, "Maxim", "Penza");
     User alex = new User(2, "Alexander", "Moscow");
     List<User> list = List.of(max, alex);
     Map<Integer, User> result = userConvert.process(list);
     Map<Integer, User> expected = Map.of(
             1, max,
             2, alex
     );
     assertThat(expected, is(result));
    }
}
