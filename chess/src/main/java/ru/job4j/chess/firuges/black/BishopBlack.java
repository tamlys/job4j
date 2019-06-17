package ru.job4j.chess.firuges.black;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.ImposibleMoveException;
/**
 * BishopBlack
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class BishopBlack implements Figure {
    private final Cell position;

    public BishopBlack(final Cell position) {
        this.position = position;
    }

    @Override
    public Cell position() {
        return this.position;
    }

    public boolean checkWay(Cell source, Cell dest) {
        return (source.x > dest.x && source.y < dest.y)
                || (source.x > dest.x && source.y > dest.y)
                || (source.x < dest.x && source.y < dest.y)
                || (source.x < dest.x && source.y > dest.y);
    }

    @Override
    public Cell[] way(Cell source, Cell dest) throws ImposibleMoveException {
        boolean isWay = checkWay(source, dest);
        int deltaX = source.x - dest.x > 0 ? -1 : 1;
        int deltaY = source.y - dest.y > 0 ? -1 : 1;
        int size = Math.abs(dest.y - source.y);
        int stepX = source.x;
        int stepY = source.y;
        Cell[] steps = new Cell[size];
        if (!isWay) {
            throw new ImposibleMoveException("Вы не можете туда пойти");
        } else {
            for (int i = 0; i < steps.length; i++) {
                stepX += deltaX;
                stepY += deltaY;
                steps[i] = Cell.values()[8 * stepX + stepY];
            }
        }
        return steps;
    }

    @Override
    public Figure copy(Cell dest) {
        return new BishopBlack(dest);
    }
}
