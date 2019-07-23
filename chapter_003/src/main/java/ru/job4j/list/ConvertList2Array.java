package ru.job4j.list;
import java.util.ArrayList;
import java.util.List;
/**
 * ConvertList2Array
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 20.07.19
 */
public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil(list.size() / (double) rows);
        int[][] array = new int[rows][cells];
        int indexRows = 0;
        int indexCells = 0;
        for (Integer i : list) {
            array[indexRows][indexCells++] = i;
            if (indexCells == cells) {
                indexCells = 0;
                indexRows++;
            }
        }
        return array;
    }
    public List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] res : list) {
            for (int count : res) {
                result.add(count);
            }
        }
        return result;
    }
}
