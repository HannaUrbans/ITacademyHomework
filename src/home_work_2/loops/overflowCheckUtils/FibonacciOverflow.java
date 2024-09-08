package home_work_2.loops.overflowCheckUtils;

public class FibonacciOverflow {

        public static void main(String[] args) {
            int n = overflowNum();
            System.out.println("Переполнение происходит на числе Фибоначчи с индексом: " + n);
        }

        public static int overflowNum() {
            int a = 0;
            int b = 1;
            int n = 1;  // Индекс числа Фибоначчи

            while (true) {
                int next = a + b;
                // Проверяем, произошел ли переполнение
                if (next < b) {
                    break;
                }

                a = b;
                b = next;
                n++;
            }

            return n;
        }
    }
