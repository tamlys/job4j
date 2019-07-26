package ru.job4j.list;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
     List<User> list = new ArrayList<>();
     User max = new User(1, "Maxim", "Penza");
     list.add(max);
     User alex = new User(2, "Alexander", "Moscow");
     list.add(alex);
     HashMap<Integer, User> res = userConvert.process(list);
     HashMap<Integer, User> search = new HashMap<>();
     search.put(1, max);
     search.put(2, alex);
     assertThat(res, is(search));
    }
}
