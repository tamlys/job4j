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
                .append(" ")
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

    @Test
    public void whenGetUserAccount() {
        Bank bank = new Bank();
        User alex = new User("Alex", "111102");
        bank.addUser(alex);
        Account account1 = new Account(5000D, "111223");
        Account account2 = new Account(1D, "111224");
        bank.addAccountToUser("111102", account1);
        bank.addAccountToUser("111102", account2);
        bank.getUserAccounts("111102");
        assertThat(bank.toString(), is(new StringBuilder()
                .append("Alex")
                .append(System.lineSeparator())
                .append("111223")
                .append(" ")
                .append("111224")
                .append(" ")
                .append(System.lineSeparator())
                .toString()
        ));
    }

    @Test
    public void whenTransferMoneyUserFromUserTrue() {
        Bank bank = new Bank();
        User alex = new User("Alex", "111102");
        bank.addUser(alex);
        Account account1 = new Account(50D, "111223");
        Account account2 = new Account(20D, "111224");
        bank.addAccountToUser("111102", account1);
        bank.addAccountToUser("111102", account2);
        boolean result = bank.transferMoney("111102", "111223", "111102", "111224", 5D);
        assertThat(result, is(true));
    }

    @Test
    public void whenTransferMoneyUserFromUserFalse() {
        Bank bank = new Bank();
        User alex = new User("Alex", "111102");
        bank.addUser(alex);
        Account account1 = new Account(50D, "111223");
        Account account2 = new Account(20D, "111224");
        bank.addAccountToUser("111102", account1);
        bank.addAccountToUser("111102", account2);
        boolean result = bank.transferMoney("111102", "111223", "111102", "111224", 1000D);
        assertThat(result, is(false));
    }

    @Test
    public void whenTransferMoneyUserFromAnotherUserTrue() {
        Bank bank = new Bank();
        User alex = new User("Alex", "111102");
        bank.addUser(alex);
        Account account1 = new Account(100D, "111223");
        bank.addAccountToUser("111102", account1);

        User max = new User("Max", "222202");
        bank.addUser(max);
        Account account2 = new Account(50D, "111222");
        bank.addAccountToUser("222202", account2);

        boolean result = bank.transferMoney("111102", "111223", "222202", "111222", 5D);
        assertThat(result, is(true));
    }

    @Test
    public void whenTransferMoneyUserFromAnotherUserFalse() {
        Bank bank = new Bank();
        User alex = new User("Alex", "111102");
        bank.addUser(alex);
        Account account1 = new Account(100D, "111223");
        bank.addAccountToUser("111102", account1);

        User max = new User("Max", "222202");
        bank.addUser(max);
        Account account2 = new Account(50D, "111222");
        bank.addAccountToUser("222202", account2);

        boolean result = bank.transferMoney("111102", "111223", "222202", "111222", 5000D);
        assertThat(result, is(false));
    }

}
