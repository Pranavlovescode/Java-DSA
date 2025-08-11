package org.example.graphs;

import java.util.*;

public class GraphsDemo {
    public static void main(String[] args) {
        int n , m ;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // Number of vertices
        m = sc.nextInt(); // Number of edges
//        Adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i=0;i<=n;i++) adj.add(new ArrayList<>());

//        Adding edges to the graph

        for (int i = 0 ; i < m; i++) {
            int src = sc.nextInt(); // Source vertex
            int dest = sc.nextInt(); // Destination vertex
            addEdge(adj, src, dest);
        }
//        Printing the adjacency list representation of the graph
        System.out.println("Adjacency list ");
        for (int i = 1; i<=n; i++){
            System.out.print(i+ " -> ");
            for (int j= 0; j < adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + ", ");
            }
            System.out.println();
        }
        System.out.println("Adjacency List Representation of Graph: "+ adj);

        ArrayList<Integer> bfsTraversal = bfs(adj, n);
        System.out.println("BFS Traversal of the graph: " + bfsTraversal);

        ArrayList<Integer> dfsTraversal = dfs(adj,n);
        System.out.println("DFS Traversal of the graph: " + dfsTraversal);

    }
//    Adding an edge to undirected graph
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int dest){
        adj.get(src).add(dest);
        adj.get(dest).add(src);
    }

//    Breadth first search (BFS) traversal of a graph
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int V) {
        boolean[] visited = new boolean[V+1];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> bfsTraversal = new ArrayList<>();
        visited[1] = true;
        queue.add(1);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            bfsTraversal.add(vertex);

            for (int neighbor : adj.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return bfsTraversal;
    }

    static ArrayList<Integer> dfs( ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] vis = new boolean[V+1];
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        vis[1] = true;
        st.push(1);

        while (!st.isEmpty()){
            int node = st.pop();
            arr.add(node);

            for (int neighbour: adj.get(node)){
                if (!vis[neighbour]){
                    vis[neighbour] = true;
                    st.push(neighbour);
                }
            }
        }
        return arr;
    }
}
