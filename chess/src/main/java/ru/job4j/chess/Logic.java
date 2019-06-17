package ru.job4j.chess;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
/**
 * Logic
 * @author Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Logic {
    private final Figure[] figures = new Figure[32];
    private int index = 0;
    public void add(Figure figure) {
        this.figures[this.index++] = figure;
    }
    public boolean isNotWay(Cell[] way) {
        boolean result = false;
        for (int i = 0; i < way.length - 1; i++) {
            Cell tmp = way[i];
            for (int f = 0; f < figures.length; f++) {
                if (figures[i].position().x == tmp.x && figures[i].position().y == tmp.y) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public boolean move(Cell source, Cell dest) throws ImposibleMoveException, OccupiedWayException, FigureNotFoundException {
        boolean rst = false;
        try {
            int index = this.findBy(source);
            if (index != -1) {
                Cell[] steps = this.figures[index].way(source, dest);
                if (steps.length > 0 && steps[steps.length - 1].equals(dest)) {
                    rst = true;
                    if (isNotWay(steps)) {
                        throw new OccupiedWayException("Вы не можете туда пойти");
                    } else {
                        this.figures[index] = this.figures[index].copy(dest);
                    }
                }
            }
        } catch (ImposibleMoveException ime) {
            System.out.println(ime.getMessage());
        } catch (OccupiedWayException owe) {
            System.out.println(owe.getMessage());
        } catch (FigureNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        }
        return rst;
    }

    public void clean() {
        for (int position = 0; position != this.figures.length; position++) {
            this.figures[position] = null;
        }
        this.index = 0;
    }

    private int findBy(Cell cell) {
        int rst = -1;
        for (int index = 0; index != this.figures.length; index++) {
            if (this.figures[index] != null && this.figures[index].position().equals(cell)) {
                rst = index;
                break;
            }
        }
        if (rst == -1) {
            throw new FigureNotFoundException("Фигура не найдена");
        }
        return rst;
    }
}
