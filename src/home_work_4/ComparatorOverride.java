package home_work_4;

import java.util.Comparator;

public class ComparatorOverride {

    public static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            if (a == null && b == null) {
                return 0; // Оба значения равны
            }
            if (a == null) {
                return -1; // null считается меньше любого непустого значения
            }
            if (b == null) {
                return 1; // непустое значение считается больше null
            }
            return a.compareTo(b);
        }
    }

    public static class StringAlphabeticComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            if (a == null && b == null) {
                return 0; // Оба значения равны
            }
            if (a == null) {
                return -1; // null считается меньше любого непустого значения
            }
            if (b == null) {
                return 1; // непустое значение считается больше null
            }
            return a.compareToIgnoreCase(b);
        }
    }

    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            if (a == null && b == null) {
                return 0; // Оба значения равны
            }
            if (a == null) {
                return -1; // null считается меньше любого непустого значения
            }
            if (b == null) {
                return 1; // непустое значение считается больше null
            }
            return Integer.compare(a.length(), b.length());
        }
    }
}
