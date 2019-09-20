package ProgrammingChallenges;
import java.util.*;

/**
 * @author Edward Flores
 * Link: https://open.kattis.com/problems/shortestpath1
 */
public class ShortestPath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int nodes = sc.nextInt(), edges= sc.nextInt(), queries = sc.nextInt(), start = sc.nextInt();
            if(nodes == 0 && edges == 0 && queries == 0 && start == 0) break;
            ArrayList<Vertex> al = new ArrayList<>();
            for(int i = 0; i < nodes; i++){
                Vertex vert = new Vertex(i);
                al.add(vert);
            }
            for(int i = 0; i < edges; i++){
                int u = sc.nextInt(), v = sc.nextInt(), w = sc.nextInt();
                Vertex vert = al.get(u);
                vert.adjacent.add((new Edge(al.get(v),w)));
           }
            dijkstra(al.get(start));
            for(int i = 0; i < queries; i++){
                int end = sc.nextInt();
                System.out.println(al.get(end).minDis == Integer.MAX_VALUE?"Impossible":al.get(end).minDis);
            }
            System.out.println();
        }
    }
    public static class Vertex implements Comparable<Vertex> {
        public final int name;
        public ArrayList<Edge> adjacent;
        public int minDis = Integer.MAX_VALUE;

        public Vertex(int name) {
                    this.name = name;
                    adjacent = new ArrayList<>();
                }
                @Override
                public int compareTo(Vertex other) {
                    return Integer.compare(this.minDis, other.minDis);
                }
            }
            public static class Edge {
                public Vertex target;
                public int weight;
                public Edge(Vertex target, int weight) {
                    this.target = target;
                    this.weight = weight;
                }
            }
    public static void dijkstra(Vertex source) {
        source.minDis = 0;
        PriorityQueue<Vertex> vertexQueue = new PriorityQueue<>();
        vertexQueue.add(source);
        while(!vertexQueue.isEmpty()) {
            Vertex u = vertexQueue.poll();
            for(Edge e : u.adjacent) {
                Vertex v = e.target;
                int disThroughU = u.minDis + e.weight;
                if(disThroughU < v.minDis) {
                    v.minDis = disThroughU;
                    vertexQueue.add(v);
                }
            }
        }
    }
}
