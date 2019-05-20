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
    private int z;
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
     * Конструктор
     * @param x начальное значение
     * @param y начальное значение
     * @param z начальное значение
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
     * метод distance
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
    /**
     * метод distance3d
     * @param that начальное значение x, y, z
     * @return расстояние между точками в трехмерном пространстве
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
}
