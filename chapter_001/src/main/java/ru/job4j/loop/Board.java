package ru.job4j.loop;
/**
 * Board
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Board {
    /**
     * method paint рисует шахматную доску шириной width на высоту height
     * @param width ширина шахматной доски
     * @param height высота шахматной доски
     * @return возвращает результат в виде строки
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if ((w + h) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append("_");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}