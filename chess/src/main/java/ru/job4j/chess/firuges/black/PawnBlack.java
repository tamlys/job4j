package ru.job4j.chess.firuges.black;
import ru.job4j.chess.ImposibleMoveException;
import ru.job4j.chess.OccupiedWayException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
/**
 * PawnBlack
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class PawnBlack implements Figure {
    private final Cell position;
    public PawnBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    public boolean checkWay(Cell source, Cell dest) {
        return source.y == dest.y + 1 && source.x == dest.x;
    }
    @Override
    public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException {
        boolean isRightWay = checkWay(source, dest);
        if (!isRightWay) {
            throw new ImposibleMoveException("Вы не можете туда пойти");
        }
        return new Cell[]{dest};
    }

    @Override
    public Figure copy(Cell dest) {
        return new PawnBlack(dest);
    }
}
