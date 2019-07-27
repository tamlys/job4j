package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * MenuTracker
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MenuTracker {
    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions(StartUI ui) {
        this.actions.add(new AddItem(0, "Добавить новую запись."));
        this.actions.add(new FindAll(1, "Показать все записи."));
        this.actions.add(new EditItem(2, "Редактировать запись."));
        this.actions.add(new DeleteItem(3, "Удалить запись."));
        this.actions.add(new FindById(4, "Найти запись по ID."));
        this.actions.add(new FindByName(5, "Найти запись по имени."));
        this.actions.add(new Exit(ui));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    class AddItem extends BaseAction {
        public AddItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            long created = System.currentTimeMillis();
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            tracker.add(new Item(name, desc, created));
        }

    }

    class FindAll extends BaseAction {
        public FindAll(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println(tracker.findAll());
        }
    }

    class EditItem extends BaseAction {
        public EditItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            long created = System.currentTimeMillis();
            String id = input.ask("Введите ID заявки :");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc, created);
            tracker.replace(id, item);
        }
    }

    class DeleteItem extends BaseAction {
        public DeleteItem(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите ID заявки :");
            tracker.delete(id);
        }
    }

    class FindById extends BaseAction {
        public FindById(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String id = input.ask("Введите ID заявки :");
            System.out.println(tracker.findById(id));
        }
    }

    class FindByName extends BaseAction {
        public FindByName(int key, String name) {
            super(key, name);
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            String name = input.ask("Введите имя заявки :");
            System.out.println(tracker.findByName(name));
        }
    }

    private class Exit implements UserAction {
        private final StartUI ui;

        Exit(StartUI ui) {
            this.ui = ui;
        }
        @Override
        public int key() {
            return 6;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("До скорых встреч");
            this.ui.stop();
        }

        @Override
        public String info() {
            return "6 - Выйти из программы.";
        }
    }
}

