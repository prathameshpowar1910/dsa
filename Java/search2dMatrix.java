//time O(n+m)

class Solution {
    public boolean searchMatrix(int[][] matrix, int key) {

    int col = matrix[0].length-1 , row = 0, n = matrix.length;
    while (row < n && col>=0) {
      if (matrix[row][col]==key) {
        return true;
      }
      else if (key<matrix[row][col]) {
        col--;
      }
      else {
        row++;
      }
    }
    return false;
    }
}
