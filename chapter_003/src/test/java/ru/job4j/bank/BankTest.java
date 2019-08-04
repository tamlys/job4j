package ru.job4j.bank;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BankTest {
    @Test
    public void whenAddUser() {
        Bank bank = new Bank();
        User user = new User("Max", "102102");
        bank.addUser(user);
        assertThat(bank.toString(), is(new StringBuilder()
            .append("Max")
            .append(System.lineSeparator())
            .append(System.lineSeparator())
            .toString()
        ));
    }

    @Test
    public void whenDeleteUser() {
        Bank bank = new Bank();
        User alex = new User("Alex", "111102");
        bank.addUser(alex);
        User max = new User("Max", "102102");
        bank.addUser(max);
        User mihail = new User("Mihail", "102102");
        bank.addUser(mihail);
        bank.deleteUser(max);
        assertThat(bank.toString(), is(new StringBuilder()
                .append("Alex")
                .append(System.lineSeparator())
                .append(System.lineSeparator())
                .append("Mihail")
                .append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()
        ));
    }

    @Test
    public void whenAddAccountToUser() {
        Bank bank = new Bank();
        User alex = new User("Alex", "111102");
        bank.addUser(alex);
        bank.addAccountToUser("111102", new Account(5000D, "151311"));
        assertThat(bank.toString(), is(new StringBuilder()
                .append("Alex")
                .append(System.lineSeparator())
                .append("151311")
                .append(System.lineSeparator())
                .toString()
        ));
    }

    @Test
    public void whenDeleteAccountToUser() {
        Bank bank = new Bank();
        User alex = new User("Alex", "111102");
        bank.addUser(alex);
        Account account = new Account(5000D, "111223");
        bank.addAccountToUser("111102", account);
        bank.deleteAccountFromUser("111102", account);
        assertThat(bank.toString(), is(new StringBuilder()
                .append("Alex")
                .append(System.lineSeparator())
                .append(System.lineSeparator())
                .toString()
        ));
    }

}
