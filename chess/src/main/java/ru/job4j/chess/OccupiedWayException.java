package ru.job4j.chess;
/**
 * OccupiedWayException
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class OccupiedWayException extends RuntimeException {
    public OccupiedWayException(String msg) {
        super(msg);
    }
}
