package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * Point
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;
    /**
     * Конструктор
     * @param first начальное значение x
     * @param second начальное значение y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    /**
     * distance
     * @param that начальное значение x и y
     * @return расстояние между точками
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    /**
     * Метод info
     * Выводит начальное значение x и y
     */
    public void info() {
        System.out.println(String.format("Point[%s, %s]", this.x, this.y));
    }
}
