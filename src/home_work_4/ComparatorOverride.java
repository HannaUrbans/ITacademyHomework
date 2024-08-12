package home_work_4;

import java.util.Comparator;

public class ComparatorOverride {

    public static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            int res = nullCaseCompare(a, b);
            if (res != 0) {
                return res;
            }
            return a.compareTo(b);
        }
    }

    public static class StringLetterComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            int result = nullCaseCompare(a, b);
            if (result != 0) {
                return result;
            }
            return a.compareToIgnoreCase(b);
        }
    }

    public static class StringLengthComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            int result = nullCaseCompare(a, b);
            if (result != 0) {
                return result;
            }
            return Integer.compare(a.length(), b.length());
        }
    }

    public static <T> int nullCaseCompare (T a, T b) {
        if (a == null && b == null) {
            return 0; // Оба значения равны
        }
        if (a == null) {
            return -1; // null меньше непустого значения
        }
        if (b == null) {
            return 1; // непустое значение больше null
        }
        return 0;
    }
}
