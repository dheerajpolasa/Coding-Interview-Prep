class Solution {
    public int hammingDistance(int x, int y) {
        int i = 0, count = 0;
        while(i < 32) {
            int x1 = (x >> i) & 1;
            int y1 = (y >> i) & 1;
            if(x1 != y1) count++;
            i++;
        }
        return count;
    }
}
