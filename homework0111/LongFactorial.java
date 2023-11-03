package org.example.homework0111;
//Оценить временную сложность фрагментов алгоритмов:
//a)
//for (int i = 0; i < n; ++i) {
//  for (int j = 1; j < m; ++j) {
//    a[i][j]++;
//  }
//}
//b)
//for (int i = 0; i < n-1; ++i) {
//  for (int j = 0; j < n-i; ++j) {
//    a[i][j]++;
//  }
//}
//c)
//for (int i = 0; i < n; ++i) {
//  for (int j = 1; j < n; j *= 3) {
//    a[i][j]++;
//  }
//}
//d)
//for (int i = 0; i < 1000; ++i) {
//  for (int j = 1; j < n; ++j) {
//    ++count;
//  }
//}
//e)
//for (int i = 0; i < n; ++i) {
//  for (int j = 0; j < n/3; ++j) {
//    matrx[i][i]++;
//  }
//}
public class LongFactorial {
    public static void main(String[] args) {
        int n = 5; // Изменяемое значение, которое мы вносим самостоятельно
        long result = factorial(n);
        System.out.println("Факториал " + n + " равен " + result);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
}
}

/*
a) time = O(n * m) потому что в первом n раз, во втором m раз
for (int i = 0; i < n; ++i) { // n
  for (int j = 1; j < m; ++j) { // m
    a[i][j]++;
  }
}

b) time = O(n^2) потому что 2 цикла с n
for (int i = 0; i < n-1; ++i) {
  for (int j = 0; j < n-i; ++j) {
    a[i][j]++;
  }
}

c) time = O(n*log3(n)) потому что во втором j *= 3
for (int i = 0; i < n; ++i) { // n
  for (int j = 1; j < n; j *= 3) { // long
    a[i][j]++;
  }
}

d) time = O(n) из-за того, что в первом 1000 раз, а во втором n
for (int i = 0; i < 1000; ++i) { // 1
  for (int j = 1; j < n; ++j) { //  n
    ++count;
  }
}

e) time = O(1)
for (int i = 0; i < n; ++i) { // n
  for (int j = 0; j < n/3; ++j) { // log n
    matrx[i][i]++;
  }
}
*/
