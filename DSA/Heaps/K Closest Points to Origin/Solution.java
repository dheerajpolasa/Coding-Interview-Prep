class Solution {
    class Point {
        int x;
        int y;
    }
    
    public int[][] kClosest(int[][] points, int K) {
        if(points.length == 0) {
            return new int[0][0];
        } else if(points.length == 1) {
            return new int[][] {{points[0][0], points[0][1]}};
        }
        PriorityQueue<Point> pq = new PriorityQueue<>(points.length, (Point a, Point b) -> {
            double first = Math.sqrt(Math.pow(a.x, 2) + Math.pow(a.y, 2));
            double second = Math.sqrt(Math.pow(b.x, 2) + Math.pow(b.y, 2));
            if(first < second) {
                return -1;
            } else {
                return 1;
            }
        });
        
        for(int[] point: points) {
            Point temp = new Point();
            temp.x = point[0];
            temp.y = point[1];
            pq.add(temp);
        }
        
        int[][] res = new int[K][2];
        int i = 0;
        while(!pq.isEmpty() && K > 0) {
            Point temp = pq.poll();
            System.out.println(temp.x + " " + temp.y);
            res[i][0] = temp.x;
            res[i][1] = temp.y;
            i++;
            K--;
        }
        
        return res;
    }
}
