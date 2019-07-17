package ru.job4j.search;
/**
 * Task
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 17.07.19
 */
public class Task {
    private String desc;
    private int priority;
    /**
     * Конструктор Task
     * @param desc описание
     * @param priority приоритет
     */
    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }
    /**
     * Геттер getDesc
     * @return desc
     */
    public String getDesc() {
        return desc;
    }
    /**
     * Геттер getPriority
     * @return priority
     */
    public int getPriority() {
        return priority;
    }
}
