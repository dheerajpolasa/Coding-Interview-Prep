import java.util.*;

class Solution {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {
      {1, 1, 1},
      {1, 0, 1},
      {1, 1, 1}
    };
    setZeroes(matrix);
    for(int i=0; i<matrix.length; i++) {
      for(int j=0; j<matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
  
  private static void setZeroes(int[][] matrix) {
    boolean[] rows = new boolean[matrix.length];
    boolean[] cols = new boolean[matrix[0].length];
    
    for(int i=0; i<matrix.length; i++) {
      for(int j=0; j<matrix.length; j++) {
        if(matrix[i][j] == 0) {
          rows[i] = true;
          cols[i] = true;
        }
      }
    }
    
    for(int i=0; i<rows.length; i++) {
      if(rows[i]) {
        setRowZero(matrix, i);
      }
    }
    
    for(int j=0; j<cols.length; j++) {
      if(cols[j]) {
        setColZero(matrix, j);
      }
    }
  }
  
  private static void setRowZero(int[][] matrix, int row) {
    for(int j=0; j<matrix[row].length; j++) {
      matrix[row][j] = 0;
    }
  }
  
  private static void setColZero(int[][] matrix, int col) {
    for(int i=0; i<matrix.length; i++) {
      matrix[i][col] = 0;
    }
  }
}
