package home_work_2.loops.overflowCheckUtils;

public class ReversedOverflow {

    public static void checkOverflow(String reversedString) {
        String maxInt = String.valueOf(Integer.MAX_VALUE);
        int result = reversedString.compareTo(maxInt);
        //reversedString.length() > 2 исключаем случай, когда reversedString состоит из 1 цифры
        if (reversedString.length() > 2 && result < 1){
            {
                throw new IllegalArgumentException("Произошло переполнение");
            }
        }
    }
}
