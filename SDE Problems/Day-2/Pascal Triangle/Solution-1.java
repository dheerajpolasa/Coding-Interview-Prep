import java.util.*;

class Solution {
  public static void main(String[] args) {
    int numRows = 5;
    List<List<Integer>> pascalTriangle = generatePascalTriangle(numRows);
    System.out.println(pascalTriangle);
  }
  
  private static List<List<Integer>> generatePascalTriangle(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> firstRow = new ArrayList<>();
    firstRow.add(1);
    result.add(firstRow);
    
    for(int i=1; i<numRows; i++) {
      List<Integer> curRow = new ArrayList<>();
      curRow.add(1);
      for(int j=1; j<result.get(i-1).size(); j++) {
        int curVal = result.get(i).get(j) + result.get(i).get(j-1);
        curRow.add(curVal);
      }
      curRow.add(1);
      result.add(curRow);
    }
    
    return result;
  }
  
}
