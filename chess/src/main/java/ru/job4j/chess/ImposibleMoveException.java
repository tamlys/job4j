package ru.job4j.chess;
/**
 * ImposibleMoveException
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class ImposibleMoveException extends RuntimeException {
    public ImposibleMoveException(String msg) {
        super(msg);
    }
}
