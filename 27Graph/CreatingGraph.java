/* Adjacency list */
import java.util.*;

public class CreatingGraph {
  static class Edge {
    int source;
    int destination;
    int weight;

    public Edge(int s, int d, int w) {
      this.source = s;
      this.destination = d;
      this.weight = w;
    }
  }
  public static void main(String[] args) {
    /* 
     *              (5)
     *          0----------1
     *                    / \
     *               (1) /   \ (3)
     *                  /     \
     *                 2-------3
     *                 | (1)
     *             (2) |
     *                 |
     *                 4
     */
    int V = 5;
    //int arr[]= new arr[V]
    ArrayList<Edge>[] graph = new ArrayList[V];//null(not defined what it has)
    for (int i = 0; i < V; i++) {
      graph[i] = new ArrayList<>();
    }
    //0 - vertex
    graph[0].add(new Edge(0, 1, 5));
    //1- vertex
    graph[1].add(new Edge(1, 0, 5));
    graph[1].add(new Edge(1, 3, 3));
    graph[1].add(new Edge(1, 2, 1));
    //2- vertex
    graph[2].add(new Edge(2, 1, 1));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 2));
    //3- vertex
    graph[3].add(new Edge(3, 1, 3));
    graph[3].add(new Edge(3, 2, 1));
    //4- vertex
    graph[4].add(new Edge(4, 2, 2));
    //2's neighbours
    System.out.println("Neighbour of 2 vertex:- ");
    for (int i = 0; i < graph[2].size(); i++) {
      Edge e = graph[2].get(i);//source, destination, wight
      System.out.println(e.destination);
    }
    //4's neighbours
    System.out.println("Neighbour of 4 vertex:- ");
    for (int i = 0; i < graph[4].size(); i++) {
      Edge e = graph[4].get(i);//source, destination, wight
      System.out.println(e.destination);
    }
  }
}
