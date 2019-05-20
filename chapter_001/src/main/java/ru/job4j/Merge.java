package ru.job4j;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int firstCount = 0;
        int secondCount = 0;
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (firstCount >= left.length) {
                rsl[i] = right[secondCount];
                secondCount++;
            } else if (secondCount >= right.length) {
                rsl[i] = left[firstCount];
                firstCount++;
            } else if (left[firstCount] < right[secondCount]) {
                rsl[i] = left[firstCount];
                firstCount++;
            } else {
                rsl[i] = right[secondCount];
                secondCount++;
            }
        }
        return rsl;
    }
}
