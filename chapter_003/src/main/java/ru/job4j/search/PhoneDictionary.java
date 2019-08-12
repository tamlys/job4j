package ru.job4j.search;
import java.util.ArrayList;
import java.util.List;
/**
 * PhoneDictionary
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 16.07.19
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<>();
    /**
     * Метод add
     * @param person добавляет нового пользователя
     */
    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Метод find
     * @param key ключ поиска
     * @return возвращает список по заданному ключу
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (person.getName().contains(key) || person.getSurname().contains(key) || person.getPhone().contains(key) || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}
