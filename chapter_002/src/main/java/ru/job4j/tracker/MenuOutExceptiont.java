package ru.job4j.tracker;
/**
 * MenuOutExceptiont
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class MenuOutExceptiont extends RuntimeException { //Наследование MenuOutExceptiont от родителя RuntimeException
    public MenuOutExceptiont(String msg) {
        super(msg);
    }
}
