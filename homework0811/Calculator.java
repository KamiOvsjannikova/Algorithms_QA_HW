//Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.
//Например:
//sum(7, 2) = 2 + 4 + 6 = 12
//sum(12, 3) = 3 + 6 + 9 + 12 = 30
//Решить задачу:
//а) через цикл
//б) через рекурсию
package org.example.homework0811;

public class Calculator {
        // Решение через цикл
        public static int sum(int n, int m) {
            int result = 0;
            for (int i = m; i <= n; i += m) {
                result += i;
            }
            return result;
        }

        // Решение через рекурсию
        public static int recursiveSum(int n, int m) {
            if (n < m) {
                return 0;
            } else {
                return m + recursiveSum(n - m, m);
            }
        }

        public static void main(String[] args) {
            int n1 = 7;
            int m1 = 2;
            int n2 = 12;
            int m2 = 3;


            int result1 = sum(n1, m1);
            int result2 = recursiveSum(n2, m2);

            System.out.println("sum(" + n1 + ", " + m1 + ") = " + result1);
            System.out.println("recursiveSum(" + n2 + ", " + m2 + ") = " + result2);
        }
    }

