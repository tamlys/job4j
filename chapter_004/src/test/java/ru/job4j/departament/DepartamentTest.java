package ru.job4j.departament;
import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * DepartamentTest
 * @author Sachenkov Maxim (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 06.08.19
 */
public class DepartamentTest {
    @Test
    public void whenAddFullDepartament() {
    Departament departament = new Departament();
    List<String> list = new ArrayList<>();
    list.add("K1/SK1");
    list.add("K1/SK2");
    list.add("K1/SK1/SSK1");
    list.add("K1/SK1/SSK2");
    list.add("K2");
    list.add("K2/SK1/SSK1");
    list.add("K2/SK1/SSK2");
    List<String> result = new ArrayList<>();
    List<String> expected = new ArrayList<>();
    expected.add("K2/SK1");
    expected.add("K1/SK1");
    expected.add("K1/SK2");
    expected.add("K1");
    expected.add("K2");
    expected.add("K1/SK1/SSK2");
    expected.add("K1/SK1/SSK1");
    expected.add("K2/SK1/SSK1");
    expected.add("K2/SK1/SSK2");
    result = departament.addComponentToFull(list);
    assertThat(expected, is(result));
    }
    @Test
    public void whenDepartamentSortedUp() {
        Departament departament = new Departament();
        List<String> list = new ArrayList<>();
        list.add("K1/SK1");
        list.add("K1/SK2");
        list.add("K1/SK1/SSK1");
        list.add("K1/SK1/SSK2");
        list.add("K2");
        list.add("K2/SK1/SSK1");
        list.add("K2/SK1/SSK2");
        List<String> result = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        expected.add("K1");
        expected.add("K1/SK1");
        expected.add("K1/SK1/SSK1");
        expected.add("K1/SK1/SSK2");
        expected.add("K1/SK2");
        expected.add("K2");
        expected.add("K2/SK1");
        expected.add("K2/SK1/SSK1");
        expected.add("K2/SK1/SSK2");
        result = departament.addComponentToFull(list);
        result = departament.sortUp(result);
        assertThat(expected, is(result));
    }
    @Test
    public void whenDepartamentSortedDown() {
        Departament departament = new Departament();
        List<String> list = new ArrayList<>();
        list.add("K1/SK1");
        list.add("K1/SK2");
        list.add("K1/SK1/SSK1");
        list.add("K1/SK1/SSK2");
        list.add("K2");
        list.add("K2/SK1/SSK1");
        list.add("K2/SK1/SSK2");
        List<String> result = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        expected.add("K2");
        expected.add("K2/SK1");
        expected.add("K2/SK1/SSK2");
        expected.add("K2/SK1/SSK1");
        expected.add("K1");
        expected.add("K1/SK2");
        expected.add("K1/SK1");
        expected.add("K1/SK1/SSK2");
        expected.add("K1/SK1/SSK1");
        result = departament.addComponentToFull(list);
        result = departament.sortDown(result);
        assertThat(expected, is(result));
    }
}
