package ru.job4j.generic;
/**
 * Store
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 21.09.19
 */
public interface Store<T extends Base> {
    /**
     * Метод add
     * Добаление элемента
     * @param model модель
     */
    void add(T model);

    /**
     * Метод replace
     * Замена элемента
     * @param id идентификатор
     * @param model можель
     * @return true, если заменил успешно
     */
    boolean replace(String id, T model);

    /**
     * Метод delete
     * Удаление элемента
     * @param id идентификатор
     * @return true, если удален успешно
     */
    boolean delete(String id);

    /**
     * Метод findById
     * Поиск элемента по id
     * @param id идентификатор
     * @return значение найденного элемента по Id
     */
    T findById(String id);
}
