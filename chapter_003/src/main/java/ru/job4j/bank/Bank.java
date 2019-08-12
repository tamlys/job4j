package ru.job4j.bank;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Bank {
    private Map<User, List<Account>> map = new TreeMap<>();
    List<Account> account = new ArrayList<>();
    public void addUser(User user) {
        map.putIfAbsent(user, account);
    }

    public void deleteUser(User user) {
        map.remove(user);
    }

    private User findUserByPassport(String passport) {
        Optional<User> user = map.keySet().stream().filter(user1 -> user1.getPassport().equals(passport)).findFirst();
        User result = null;
        if (user.isPresent()) {
            result = user.get();
        }
        return result;
    }

    private Account findAccountByPassportAndRequisites(String passport, String requisites) {
        final User userByPassport = this.findUserByPassport(passport);
        Optional<Account> account = map.get(userByPassport).stream().filter(account1 -> account1.getRequisites().equals(requisites)).findFirst();
        Account result = null;
        if (account.isPresent()) {
            result = account.get();
        }
        return result;
    }

    public void addAccountToUser(String passport, Account account) {
        User user = findUserByPassport(passport);
        if (user != null) {
            map.get(user).add(account);
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        User user = findUserByPassport(passport);
        map.get(user).remove(account);
    }

    public List<Account> getUserAccounts(String requisites) {
        List<Account> result = new ArrayList<>();
        for (User user : map.keySet()) {
            for (Account account : map.get(user)) {
                if (account.getRequisites().equals(requisites)) {
                    result.add(account);
                    break;
                }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        boolean result = false;
        Account sender = findAccountByPassportAndRequisites(srcPassport, srcRequisite);
        Account recipient = findAccountByPassportAndRequisites(destPassport, dstRequisite);
        if (sender != null && recipient != null) {
            if (sender.getValue() >= amount) {
                sender.setValue(recipient.getValue() + amount);
                result = true;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (User user : map.keySet()) {
            sb.append(user.getName()).append(System.lineSeparator());
            for (Account account : map.get(user)) {
                sb.append(account.getRequisites());
                sb.append(" ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
