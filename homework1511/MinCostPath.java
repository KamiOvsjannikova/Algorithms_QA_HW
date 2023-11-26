package org.example.homework1511;

public class MinCostPath {
    public static int minCost(int[][] costPath) {
        int rows = costPath.length;
        int cols = costPath[0].length;

        int[][] dp = new int[rows][cols];  // Создаю массив для хранения минимальной стоимости пути

        dp[0][0] = costPath[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i - 1][0] + costPath[i][0];
        }
        for (int j = 1; j < cols; j++) {
            dp[0][j] = dp[0][j - 1] + costPath[0][j];
        }

        for (int i = 1; i < rows; i++) { // Заполняю остальные ячейки массива dp
            for (int j = 1; j < cols; j++) {
                dp[i][j] = costPath[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        int[][] costs = new int[][]{
                {0, 1, 4, 4},
                {4, 1, 1, 1},
                {4, 4, 4, 1},
                {4, 4, 4, 0}
        };
        int result = minCost(costs);
        System.out.println("minCost(costs) = " + result);
    }
}
