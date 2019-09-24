package ru.job4j.generic;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * StoreTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 21.09.19
 */
public class StoreTest {
    @Test
    public void whenStoreUserThenResult() {
        UserStore userStore = new UserStore(new SimpleArray<User>(2));
        User user1 = new User("userOne");
        User user2 = new User("userTwo");
        userStore.add(user1);
        userStore.add(user2);
        User searchUser = userStore.findById("userOne");
        assertThat(userStore.getValues().get(0), is(searchUser));
        userStore.delete("userOne");
        assertThat(userStore.getValues().get(0), is(user2));
        User replaceUser = new User("userThree");
        userStore.replace("userTwo", replaceUser);
        assertThat(userStore.getValues().get(0).getId(), is("userThree"));
    }

    @Test
    public void whenStoreRoleThenResult() {
        RoleStore roleStore = new RoleStore(new SimpleArray <Role>(2));
        Role role1 = new Role("roleOne");
        Role role2 = new Role("roleTwo");
        roleStore.add(role1);
        roleStore.add(role2);
        Role searchRole = roleStore.findById("roleOne");
        assertThat(roleStore.getValues().get(0), is(searchRole));
        roleStore.delete("roleOne");
        assertThat(roleStore.getValues().get(0), is(role2));
        Role replaceRole = new Role("roleThree");
        roleStore.replace("roleTwo", replaceRole);
        assertThat(roleStore.getValues().get(0).getId(), is("roleThree"));
    }
}
