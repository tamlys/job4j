package ru.job4j.chess;
/**
 * FigureNotFoundException
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class FigureNotFoundException extends RuntimeException {
    public FigureNotFoundException(String msg) {
        super(msg);
    }
}
