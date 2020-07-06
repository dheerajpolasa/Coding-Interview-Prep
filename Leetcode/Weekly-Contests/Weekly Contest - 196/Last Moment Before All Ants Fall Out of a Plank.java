/*
We have a wooden plank of the length n units. Some ants are walking on the plank, each ant moves with speed 1 unit per second. 
Some of the ants move to the left, the other move to the right.

When two ants moving in two different directions meet at some point, 
they change their directions and continue moving again. Assume changing directions doesn't take any additional time.

When an ant reaches one end of the plank at a time t, it falls out of the plank imediately.

Given an integer n and two integer arrays left and right, the positions of the ants moving to the left and the right. 
Return the moment when the last ant(s) fall out of the plank.

 
https://leetcode.com/contest/weekly-contest-196/problems/last-moment-before-all-ants-fall-out-of-a-plank/

*/


// Solution - 1 Brute Force

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        if(left.length == 0 && right.length == 0) {
            return 0;
        }
        else if(left.length == 0 && right.length != 0) {
            int min = getMin(right);
            return n - min;
        }
        else if(left.length != 0 && right.length == 0) {
            int max = getMax(left);
            return max - 0;
        }
        int time = 0;
        while(true) {
            if(check(left, right)) {
                return time-1;
            }
            time++;
            for(int i=0; i<left.length; i++) {
                if(left[i] == -1) continue;
                left[i] = left[i] - 1 < 0 ? -1 : left[i] - 1;
            }
            for(int i=0; i<right.length; i++) {
                if(right[i] == -1) continue;
                right[i] = right[i] + 1 > n ? -1 : right[i] + 1;
            }
            // print(left, right);
        }
    }
    
    private int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int val: arr) {
            max = Math.max(max, val);
        }
        return max;
    }
    
    private int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int val: arr) {
            min = Math.min(min, val);
        }
        return min;
    }
    
    private void print(int[] left, int[] right) {
        for(int i=0; i<left.length; i++) {
            System.out.print(left[i] + " ");
        }
        System.out.println();
        for(int i=0; i<right.length; i++) {
            System.out.print(right[i] + " ");
        }
        System.out.println();
    }
    
    private boolean check(int[] left, int[] right) {
        for(int i=0; i<left.length; i++) {
            if(left[i] >= 0) {
                return false;
            }
        }
        
        for(int i=0; i<right.length; i++) {
            if(right[i] >= 0) {
                return false;
            }
        }
        
        return true;
    }
}

// Solution - 2 Sorting
class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        Arrays.sort(left);
        Arrays.sort(right);
        if(left.length == 0 && right.length == 0) return 0;
        else if(left.length == 0) return n-right[0];
        else if(right.length == 0) return left[left.length-1];
        return Math.max(n-right[0], left[left.length-1]);
    }
}



// Solution - 3 Efficient

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max = 0;
        for(int val: left) max = Math.max(val, max);
        for(int val: right) max = Math.max(n-val, max);
        return max;
    }
}

