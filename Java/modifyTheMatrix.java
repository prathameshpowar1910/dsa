//PROBLEM NO 100230

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length ;
        int n = matrix[0].length ;
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            answer[i] = Arrays.copyOf(matrix[i], n);
        }
        for (int j = 0; j < n; j++) {
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] != -1 && matrix[i][j] > maxVal) {
                    maxVal = matrix[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] == -1) {
                    answer[i][j] = maxVal;
                }
            }
        }
        
        return answer;
    }
}
