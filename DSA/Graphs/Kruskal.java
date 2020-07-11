import java.util.*;

public class Solution {
    
    
    static class Edge implements Comparable<Edge>{
        int v1;
        int v2;
        int weight;
        
        Edge(int u, int v, int w) {
            this.v1 = u;
            this.v2 = v;
            this.weight = w;
        }
        
        @Override
        public int compareTo(Edge e) {
            return this.weight - e.weight;
        }
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        Edge edges[] = new Edge[E];
        for(int i=0; i<E; i++) {
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int w = s.nextInt();
            Edge edge = new Edge(v1, v2, w);
            edges[i] = edge;
        }
        
        Edge[] mst = kruskal(edges, V);
        for(int i=0; i<mst.length; i++) {
            if(mst[i].v1 < mst[i].v2) {
                System.out.println(mst[i].v1 + " " + mst[i].v2 + " " + mst[i].weight);
            } else {
                System.out.println(mst[i].v2 + " " + mst[i].v1 + " " + mst[i].weight);                
            }
        }
	}
    
    private static Edge[] kruskal(Edge[] edges, int v) {
        Arrays.sort(edges);
        Edge[] mst = new Edge[v-1];
        int[] parent = new int[v];
        for(int i=0; i<v; i++) {
            parent[i] = i;
        }
        int count = 0, i = 0;
        while(count != v-1) {
            Edge currentEdge = edges[i++];
            int parentOfV1 = getParent(parent, currentEdge.v1);
            int parentOfV2 = getParent(parent, currentEdge.v2);
            
            if(parentOfV1 != parentOfV2) {
                mst[count++] = currentEdge;
                parent[parentOfV1] = parentOfV2;
            }
        }
        return mst;
    }
    
    private static int getParent(int[] parent, int v1) {
        while(parent[v1] != v1) {
            v1 = parent[v1];
        }
        return v1;
    }
}
