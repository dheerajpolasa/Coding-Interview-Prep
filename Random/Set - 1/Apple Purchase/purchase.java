import java.io.*;
import java.util.*;
class Solution {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int res = getMinimumPrice(arr, n);
        System.out.println(res);
	}
    
    private static int getMinimumPrice(int[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(n, Collections.reverseOrder());
        for(int a: arr) pq.add(a);
        int res = 0;
        while(!pq.isEmpty()) {
            int first = pq.poll();
            if(pq.isEmpty()) {
                res += first;
                break;
            }
            res += first;
            int second = pq.poll();
            if(pq.isEmpty()) {
                res += second;
                break;
            }
            res += second;
            int third = pq.poll();
        }
        
        return res;
    }
}
