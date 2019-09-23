package ru.job4j.generic;
/**
 * AbstractStore
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 21.09.19
 */
public class AbstractStore<T extends Base> implements Store<T> {
    /**
     * SimpleArray<T> массив элементов типа T
     */
    private SimpleArray<T> values;

    /**
     * Конструктор AbstractStore
     * @param values массив элементов
     */
    public AbstractStore(SimpleArray<T> values) {
        this.values = values;
    }

    /**
     * getValues геттер
     * @return элемент массива
     */
    public SimpleArray<T> getValues() {
        return values;
    }

    /**
     * Метод findIndexById
     * Поиск индекса по Id
     * @param id идентификатор
     * @return индекс элемента
     */
    private int findIndexById(String id) {
        int result = -1;
        int index = 0;
        for (T value : values) {
            if (value.getId().equals(id)) {
                result = index;
                break;
            }
            index++;
        }
        return result;
    }

    /**
     * Метод add
     * Добавление элемента
     * @param model модель
     */
    public void add(T model) {
        values.add(model);
    }

    /**
     * Метод replace
     * Замена элемента
     * @param id идентификатор
     * @param model модель
     * @return true, если элемент заменен
     */
    public boolean replace(String id, T model) {
        boolean result = false;
        if (findIndexById(id) != -1) {
            values.set(findIndexById(id), model);
            result = true;
        }
        return result;
    }

    /**
     * Метод delete
     * Удаление элемента
     * @param id идентификатор
     * @return true, если элемент удален
     */
     public boolean delete(String id) {
        boolean result = false;
        if (findIndexById(id) != -1) {
            values.remove(findIndexById(id));
            result = true;
        }
        return result;
    }

    /**
     * Метод findById
     * Поиск элемента по Id
     * @param id идентификатор
     * @return значение найденного элемента по Id
     */
    public T findById(String id) {
        return values.get(findIndexById(id));
    }
}
