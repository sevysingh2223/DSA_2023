package Graph;

import java.util.ArrayList;
import java.util.List;

class Edge{
    int source , destination ,weight;
    Edge(int s, int d ,int w){
        this.source = s;
        this.destination=d;
        this.weight=w;
    }
}
public class WeightedGraph {

    int N;
    List<Edge>[] adjList;
    
    public WeightedGraph(int n) {
        this.N =n;
        adjList = new ArrayList[n];
        for (int i = 0 ;i < n ; i++) {
            adjList[i] = new ArrayList<>();
            }
    }

    public void addEdge(int source , int destination ,int weight){
        Edge edge = new Edge(source , destination , weight);
        adjList[source].add(edge);
        // System.out.println( "Adding edge :" + source + "->"+ destination );
    }

    public void printGraph(){
        for(int i=0;i<N;i++){
            System.out.print("Node  "+i+" is connected to -> ");
            for(Edge e:adjList[i]){
                System.out.print("{"+e.destination+"/Weight:"+e.weight+"} ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int N =5;
        WeightedGraph g = new WeightedGraph(N);
        
        // Adding edges to the graph
        g.addEdge(0 ,1 ,5);  
        g.addEdge(0 ,2 ,7);  
        g.addEdge(1 ,3 ,6);  
        g.addEdge(2,4,5);  
        g.addEdge(2,3,4);  
        g.addEdge(4,1,4); 
        g.printGraph(); 
    }
}
