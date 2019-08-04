package ru.job4j.bank;
import java.util.Objects;
/**
 * Account
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 04.08.19
 */
public class Account {
    /**
     * value (кол-во денег),
     * requisites (реквизиты счёта) - это банковский счёт
     */
    private Double value;
    private String requisites;

    public Account(Double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public Double getValue() {
        return this.value;
    }
    public String getRequisites() {
        return this.requisites;
    }
    public void setValue(Double value) {
        this.value = value;
    }
    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(value, account.value)
                && Objects.equals(requisites, account.requisites);
    }
    @Override
    public int hashCode() {
        return Objects.hash(value, requisites);
    }
}
