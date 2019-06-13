package ru.job4j.tracker;
import java.util.Arrays;
import java.util.Random;
/**
 * TrackerEagerLoading
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
    public class  TrackerEagerLoading {
    private static  final TrackerEagerLoading INSTANCE = new TrackerEagerLoading();
    private TrackerEagerLoading() {
    }
    public static TrackerEagerLoading getInstance() {
        return INSTANCE;
    }
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;
    private static final Random RN = new Random();
    /**
     * Метод реализаущий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
            result = null;
        }
        return result;
    }
    /**
     * Метод выводит все значения массива, которые не равны Null
     * @return массив со значениями не равными Null
     */
    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }
    /**
     * Метод ищет ячейку по Id и заменяет ее на новую с тем же Id
     * @param id уникальный ключ
     * @param item новая ячейка
     * @return ячейку с новыми значениями полей
     */
    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                items[i] = item;
                item.setId(id);
                result = true;
                break;
            }
        }
        return result;
    }
    /**
     * Метод ищет ячейку по Id и удаляет ее со сдвигом ячеек влево.
     * @param id уникальный ключ
     * @return массив данных без удаленной ячейки
     */
    public boolean delete(String id) {
        boolean result = false;
        for (int i = 0; i < this.position; i++) {
            if (items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
                this.position--;
                result = true;
            }
        }
        return result;
    }
    /**
     * Метод ищет ячейки по заданному имени
     * @param key ключ поиска
     * @return ячейку с заданным именем
     */
    public Item[] findByName(String key) {
        int newLength = 0;
        for (int i = 0; i != this.position; i++) {
            if (items[i].getName().equals(key)) {
                newLength++;
            }
        }
        return Arrays.copyOf(this.items, newLength);
    }

    public static void main(String[] args) {
        TrackerEagerLoading tracker = TrackerEagerLoading.getInstance();
    }
}

