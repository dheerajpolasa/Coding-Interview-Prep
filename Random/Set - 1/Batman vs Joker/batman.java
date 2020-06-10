import java.util.*;

public class Solution {

    public static void main(String args[]) {
        //Write your code here
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int res = getSum(arr, n);
        System.out.println(res);
    }
    
    private static int getSum(int[] arr, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        long res = 0;
        stack.push(0);
        for(int i=1; i<arr.length; i++) {
            while(!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                res = (res + (arr[i] % 1000000007) % 1000000007);
                stack.pop();
            }
            stack.push(i);
        }
        return (int) res % 1000000007;
    }

}
