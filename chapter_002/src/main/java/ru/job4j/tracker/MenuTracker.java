package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    public void fillActions() {
        this.actions.add(new AddItem());
        this.actions.add(new FindAll());
        this.actions.add(new EditItem());
        this.actions.add(new DeleteItem());
        this.actions.add(new FindById());
        this.actions.add(new FindByName());
        this.actions.add(new Exit());
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

    private class AddItem implements UserAction {
        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            long created = System.currentTimeMillis();
            System.out.println("------------ Добавление новой заявки --------------");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc, created);
            tracker.add(item);
            System.out.println("------------ Новая заявка с Id : " + item.getId());
            System.out.println("------------ Новое название заявки : " + item.getName());
            System.out.println("------------ Описание новой заявки : " + item.getDesc());
        }

        @Override
        public String info() {
            return "0 - Добавить новую запись.";
        }
    }

    private class FindAll implements UserAction {
        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Вывод всех заявок --------------");
            System.out.println(Arrays.toString(tracker.findAll()));
        }

        @Override
        public String info() {
            return "1 - Показать все записи.";
        }
    }

    private class EditItem implements UserAction {
        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            long created = System.currentTimeMillis();
            System.out.println("------------ Редактирование заявки --------------");
            String id = input.ask("Введите ID заявки :");
            String name = input.ask("Введите имя заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc, created);
            if (tracker.replace(id, item)) {
                System.out.println("------------ Заявка с ID : " + id + " найдена ------------");
            } else {
                System.out.println("------------ Заявка с ID : " + id + " не найдена ------------");
            }
        }
        @Override
        public String info() {
            return "2 - Редактировать запись.";
        }
    }

    private class DeleteItem implements UserAction {
        @Override
        public int key() {
            return 3;
        }
        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Удаление заявки --------------");
            String id = input.ask("Введите ID заявки :");
            if (tracker.delete(id)) {
                System.out.println("------------ Заявка с ID : " + id + " удалена ------------");
            } else {
                System.out.println("------------ Заявка с ID : " + id + " не найдена ------------");
            }
        }

        @Override
        public String info() {
            return "3 - Удалить запись.";
        }
    }

    private class FindById implements UserAction {
        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по ID --------------");
            String id = input.ask("Введите ID заявки :");
            Item result = tracker.findById(id);
            if (result != null) {
                System.out.println(result);
            } else {
                System.out.println("------------ Заявка с ID : " + id + " не найдена ------------");
            }
        }

        @Override
        public String info() {
            return "4 - Найти запись по ID.";
        }
    }

    private class FindByName implements UserAction {
        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Поиск заявки по имени --------------");
            String name = input.ask("Введите имя заявки :");
            Item[] result = tracker.findByName(name);
            if (result != null) {
                System.out.println(Arrays.toString(result));
            } else {
                System.out.println("------------ Заявка с именем : " + name + " не найдена ------------");
            }
        }

        @Override
        public String info() {
            return "5 - Найти запись по имени.";
        }
    }

    private class Exit implements UserAction {
        @Override
        public int key() {
            return 6;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.exit(key());
        }

        @Override
        public String info() {
            return "6 - Выйти из программы.";
        }
    }
}

