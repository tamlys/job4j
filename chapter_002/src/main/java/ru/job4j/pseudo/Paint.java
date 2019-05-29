package ru.job4j.pseudo;
/**
 * Paint
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Paint {
    /**
     * Метод draw
     * @param shape выводит в видео строки заданную фигуру
     */
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }
}
