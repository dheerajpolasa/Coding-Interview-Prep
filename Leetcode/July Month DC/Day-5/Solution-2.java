class Solution {
    public int hammingDistance(int x, int y) {
        int i = 0, count = 0;
        int xor = x ^ y;
        while(xor > 0) {
            count += (xor & 1) == 1 ? 1 : 0;
            xor >>= 1;
        }
        return count;
    }
}
