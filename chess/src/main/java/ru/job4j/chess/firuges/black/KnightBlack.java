package ru.job4j.chess.firuges.black;

import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.ImposibleMoveException;
/**
 * KnightBlack
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class KnightBlack implements Figure {
    private final Cell position;

    public KnightBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    public boolean checkWay(Cell source, Cell dest) {
        return ((Math.abs(source.x - dest.x) == 2) && (Math.abs(source.y - dest.y) == 1))
                || ((Math.abs(source.x - dest.x) == 1) && (Math.abs(source.y - dest.y) == 2));
    }

    @Override
    public Cell[] way(Cell source, Cell dest)  throws ImposibleMoveException  {
        boolean isRightWay = checkWay(source, dest);
        if (!isRightWay) {
            throw new ImposibleMoveException("Вы не можете туда пойти");
        }
        return new Cell[]{dest};
    }

    @Override
    public Figure copy(Cell dest) {
        return new KnightBlack(dest);
    }
}
