package ru.job4j.departament;
import java.util.*;
/**
 * Departament
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class Departament {
    /**
     * Метод addComponentToFull заполняет список Departament недостающими элементами
     * @param list список
     * @return заполненный список
     */
    public List<String> addComponentToFull(List<String> list) {
        Set<String> departament = new HashSet<>(list);
            for (String component : list) {
                if (component.length() == 11 && component.substring(0, 6) != component) {
                    departament.add(component.substring(0, 6));
                }
                for (String s : component.split("/")) {
                    if (s != component) {
                        departament.add(s);
                        break;
                    }
                }
            }
            List<String> result = new ArrayList<>();
            result.addAll(departament);
        return result;
    }
    /**
     * Метод sortUp сортирует список по возрастанию
     * @param list список
     * @return отсортированный список
     */
    public List<String> sortUp(List<String> list) {
        List<String> res = new ArrayList<>(list);
        Collections.sort(res);
        return res;
    }
    /**
     * Метод sortDown сортирует список по убыванию
     * @param list список
     * @return отсортированный список
     */
    public List<String> sortDown(List<String> list) {
        List<String> res = new ArrayList<>(list);
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int result = 0;
                int length = o1.length() < o2.length() ? o1.length() : o2.length();
                for (int i = 0; i < length; i++) {
                    result = Character.compare(o2.charAt(i), o1.charAt(i));
                    if (result != 0) {
                        break;
                    }
                }
                if (result == 0) {
                    result = Integer.compare(o1.length(), o2.length());
                }
                return result;
            }
        });
        return res;
    }
}
