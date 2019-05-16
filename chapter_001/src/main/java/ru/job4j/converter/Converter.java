package ru.job4j.converter;
/**
 * converter
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Converter {
    /**
     * Method rubleToEuro
     * @param value - is value ruble.
     * @return convert ruble to euro.
     */
    public int rubleToEuro(int value) {
        return value / 70;
    }
    /**
     * Method rubleToDollar
     * @param value - is value ruble.
     * @return convert ruble to dollar.
     */
    public int rubleToDollar(int value) {
        return value / 60;
    }
    /**
     * Method euroToRuble
     * @param value - is value ruble.
     * @return convert euro to ruble.
     */
    public int euroToRuble(int value) {
        return value * 70;
    }
    /**
     * Method dollarToRuble
     * @param value - is value ruble.
     * @return convert dollar to ruble.
     */
    public int dollarToRuble(int value) {
        return value * 60;
    }

}
