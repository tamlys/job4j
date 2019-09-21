package ru.job4j.generic;
/**
 * Base
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 21.09.19
 */
public abstract class Base {
    private final String id;

    /**
     * Конструктор Base
     * @param id идентификатор
     */
    protected Base(final String id) {
        this.id = id;
    }

    /**
     * Геттер getId
     * @return идентификатор
     */
    public String getId() {
        return id;
    }
}
