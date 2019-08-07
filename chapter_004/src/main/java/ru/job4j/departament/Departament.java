package ru.job4j.departament;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Departament {
    public Set<String> addComponentToFull (List<String> list) {
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
        return departament;
    }
}
