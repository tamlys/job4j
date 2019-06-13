package ru.job4j.tracker;
import java.util.*;
/**
 * ConsoleInput
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
    @Override
    public int ask(String question, List<Integer> range) throws MenuOutExceptiont {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value: range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutExceptiont("Не верные данные. Выберите пункт меню от 0 до 6");
        }
        return key;
    }

}
