package ru.job4j.bank;
import java.util.*;

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
        User result = null;
        for (User user : map.keySet()) {
            if (user != null) {
                if (user.getPassport().equals(passport)) {
                    result = user;
                }
            }
        }
        return result;
    }

    private Account findAccountByPassportAndRequisites(String passport, String requisites) {
        Account result = null;
        final User userByPassport = this.findUserByPassport(passport);
        if (userByPassport != null) {
            final List<Account> accounts = map.get(userByPassport);
            for (Account acc : accounts) {
                if (acc.getRequisites().equals(requisites)) {
                    result = acc;
                }
            }
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
