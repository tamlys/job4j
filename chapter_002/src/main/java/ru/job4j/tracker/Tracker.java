package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Tracker
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final List<Item> items = new ArrayList<>();
    /**
     * Указатель ячейки для новой заявки.
     */
    private static final Random RN = new Random();

    int indexOf(String id) {
        int result = -1;
        for (int i = 0; i < items.size(); i++) {
            if ((items.get(i) != null) && (id.equals(items.get(i).getId()))) {
                result = i;
            }
        }
        return result;
    }

    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        if (items.isEmpty()) {
            items.add(0, item);
        } else {
            items.add(items.lastIndexOf(item), item);
        }
        return item;
    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
    /**
     * Метод ищет данные по уникальному ключу
     * @param id уникальный ключ
     * @return ячейку массива с заданным Id
     */
    public List<Item> findById(String id) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result.add(item);
                break;
            }
        }
        return result;
    }
    /**
     * Метод выводит все значения массива, которые не равны Null
     * @return массив со значениями не равными Null
     */
    public List<Item> findAll() {
        return items;
    }
    /**
     * Метод ищет ячейку по Id и заменяет ее на новую с тем же Id
     * @param id уникальный ключ
     * @param item новая ячейка
     * @return ячейку с новыми значениями полей
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            items.set(index, item);
            item.setId(id);
            return true;
        }
        return false;
    }
    /**
     * Метод ищет ячейку по Id и удаляет ее со сдвигом ячеек влево.
     * @param id уникальный ключ
     * @return массив данных без удаленной ячейки
     */
    public boolean delete(String id) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
                items.remove(index);
                result = true;
            }
        return result;
    }

    /**
     * Метод ищет ячейки по заданному имени
     * @param key ключ поиска
     * @return ячейку с заданным именем
     */
    public List<Item> findByName(String key) {
        List<Item> list = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                list.add(item);
            }
        }
        return list;
    }

}

