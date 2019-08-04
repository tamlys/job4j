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
            if (user.getPassport().equals(passport)) {
                result = user;
            }
        }
        return result;
    }

    private Account findAccountByRequisites(String requisites) {
        Account result = null;
        for (User user : map.keySet()) {
            for (Account account : map.get(user)) {
                if (account.getRequisites().equals(requisites)) {
                    result = account;
                }
            }
        }
        return result;
    }

    public void addAccountToUser(String passport, Account account) {
        User user = findUserByPassport(passport);
        map.get(user).add(account);
    }

    public void deleteAccountFromUser(String passport, Account account) {
        User user = findUserByPassport(passport);
        map.get(user).remove(account);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (User user : map.keySet()) {
            sb.append(user.getName()).append(System.lineSeparator());
            for (Account account : map.get(user)) {
                sb.append(account.getRequisites());
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
