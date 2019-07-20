package ru.job4j.list;
import java.util.ArrayList;
import java.util.List;
/**
 * ConvertMatrix2List
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 20.07.19
 */
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] count : array) {
            for (int index : count) {
                list.add(index);
            }
        }
        return list;
    }
}
