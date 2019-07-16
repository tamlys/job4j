package ru.job4j.search;
/**
 * Person
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 16.07.19
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;
    /**
     * Person конструктор
     * @param name имя
     * @param surname фамилия
     * @param phone телефон
     * @param address адресс
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }
    /**
     *геттер getName
     * @return возвращает имя
     */
    public String getName() {
        return name;
    }
    /**
     *геттер getSurname
     * @return возвращает фамилию
     */
    public String getSurname() {
        return surname;
    }
    /**
     *геттер getPhone
     * @return возвращает телефон
     */
    public String getPhone() {
        return phone;
    }
    /**
     *геттер getAddress
     * @return возвращает адрес
     */
    public String getAddress() {
        return address;
    }


}
