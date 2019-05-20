package ru.job4j.condition;
/**
 * Triangle
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    /**
     * Triangle
     * @param ap переменная типа Point
     * @param bp переменная типа Point
     * @param cp переменная типа Point
     */
    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**
     * period
     * @param a длина от точки a b.
     * @param b длина от точки a c.
     * @param c длина от точки b c.
     * @return значение периметра
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    /**
     * area
     * @return площадь треугольника
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
    /**
     * exist
     * @param a длина от точки a b.
     * @param b длина от точки a c.
     * @param c длина от точки b c.
     * @return проверяет, можно ли построить треугольник с заданными сторонами и возвращает true или false
     */
    private boolean exist(double a, double c, double b) {
        return a + b > c && a + c > b && b + c > a;
    }
}

