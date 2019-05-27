package ru.job4j.tracker;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * StartUI
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";
    /**
     * Константа для просмотра всех записей
     */
    private static final String SHOWALLITEMS = "1";
    /**
     * Константа для редактирования записей
     */
    private static final String EDIT = "2";
    /**
     * Константа для удаление записей
     */
    private static final String DELETE = "3";
    /**
     * Константа для поиска записей по ID
     */
    private static final String FINDBYID = "4";
    /**
     * Константа для поиска записей по имени
     */
    private static final String FINDBYNAME = "5";
    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;
    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;
    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOWALLITEMS.equals(answer)) {
                this.showItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.findById();
            } else if (FINDBYNAME.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }
    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        long created = System.currentTimeMillis();
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, created);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + " -----------");
    }
    /**
     * Метод отображает все заявки
     */
    private void showItems() {
        System.out.println("------------ Вывод всех заявок --------------");
        System.out.println(Arrays.toString(this.tracker.findAll()));
    }
    /**
     * Метод реализует редактирование заявки
     */
    private void editItem() {
        long created = System.currentTimeMillis();
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите ID заявки :");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, created);
        if ( this.tracker.replace(id, item)){
            System.out.println("------------ Заявка с ID : " + id + " найдена ------------");
        } else {
            System.out.println("------------ Заявка с ID : " + id + " не найдена ------------");
        }
    }
    /**
     * Метод реализует удаление заявки
     */
    private void deleteItem() {
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("Введите ID заявки :");
        if ( this.tracker.delete(id)){
            System.out.println("------------ Заявка с ID : " + id + " удалена ------------");
        } else {
            System.out.println("------------ Заявка с ID : " + id + " не найдена ------------");
        }
    }
    /**
     * Метод реализует поиск заявки по ID
     */
    private void findById() {
        System.out.println("------------ Поиск заявки по ID --------------");
        String id = this.input.ask("Введите ID заявки :");
        Item result = this.tracker.findById(id);
        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("------------ Заявка с ID : " + id + " не найдена ------------");
        }
    }

    /**
     * Метод реализует поиск заявки по имени
     */
    private void findByName() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        Item[] result = this.tracker.findByName(name);
        if (result != null) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("------------ Заявка с именем : " + name + " не найдена ------------");
        }
    }
    /**
     * Метод реализует отображение меню
     */
    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0 - Добавить новую запись.");
        System.out.println("1 - Показать все записи.");
        System.out.println("2 - Редактировать запись.");
        System.out.println("3 - Удалить запись.");
        System.out.println("4 - Найти запись по ID.");
        System.out.println("5 - Найти запись по имени.");
        System.out.println("6 - Выйти из программы.");
    }
    /**
     * Запускт программы.
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
