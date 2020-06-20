class Solution {
    class Freq {
        int freq;
        char val;
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c: s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Freq> pq = new PriorityQueue<Freq>((Freq a, Freq b) -> {
            if(a.freq > b.freq) {
                return -1;
            } else {
                return 1;
            }
        });
        for(char c: s.toCharArray()) {
            if(hm.containsKey(c)) {
                int freq = hm.get(c);
                Freq temp = new Freq();
                temp.freq = freq;
                temp.val = c;
                pq.add(temp);
                hm.remove(c);
            }
        }
        String res = "";
        while(!pq.isEmpty()) {
            Freq cur = pq.poll();
            for(int i=0; i<cur.freq; i++) {
                res += cur.val;
            }
        }
        
        return res;
    }
}
