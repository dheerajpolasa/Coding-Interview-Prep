import java.io.*;
import java.util.*;
class Solution {
	public static void main (String[] args) {
    // Take input as given in the input format 
	// And accordingly print the output as in output format.
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0, matches = n;
        while(count < 4) {
            matches--;
            count++;
        }
        
        System.out.println(matches * 2);
	}
}
