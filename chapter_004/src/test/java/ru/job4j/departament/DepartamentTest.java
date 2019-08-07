package ru.job4j.departament;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
    Set<String> result = new HashSet<>();
    Set<String> expected = new HashSet<>();
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
}
