package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * StartUI
 * @author Sachenkov Maxim(oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class StartUI {
    private boolean working = true;
    private final Consumer<String> output;
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
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker, Consumer<String> output) {
        this.input = input;
        this.tracker = tracker;
        this.output = output;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker, output);
        List<Integer> range = new ArrayList<>();
        menu.fillActions(this);
        for (int i = 0; i < menu.getActionsLentgh(); i++) {
            range.add(i);
        }
        do {
            menu.show();
            menu.select(input.ask("Select: ", range));
        } while (this.working);
    }

    public void stop() {
        this.working = false;
    }

    /**
     * Запускт программы.
     */
    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker(), System.out::println).init();
    }
}
