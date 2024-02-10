package Graph;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Graph {
    private static Map<Integer, List<Integer>> g;

    Graph() {
        g = new HashMap<>();
    }

    void addNode(int node) {
        if (!g.containsKey(node)) {
            g.put(node, new LinkedList<>());
        } else {
            System.out.println("Node already exists");
        }
    }

    void addEdge(int nodeA, int nodeB) {
        if (g.containsKey(nodeA) && g.containsKey(nodeB)) {
            g.get(nodeA).add(nodeB);
            // g.get(nodeB).add(nodeA);
        } else {
            System.out.println("One or both nodes do not exist");
        }
    }

    void print() {
        for (Map.Entry<Integer, List<Integer>> entry : g.entrySet()) {
            System.out.print("Node " + entry.getKey() + ": ");
            for (Integer connector : entry.getValue()) {
                System.out.print(connector + " ");
            }
            System.out.println();
        }
    }

    void updateGraph(int nodeA, int nodeB, boolean flag) {
        if (flag) {
            addEdge(nodeA, nodeB);
        } else {
            removeEdge(nodeA, nodeB);
        }
    }

    void removeEdge(int nodeA, int nodeB) {
        if (g.containsKey(nodeA) && g.containsKey(nodeB)) {
            g.get(nodeA).remove(Integer.valueOf(nodeB));
            g.get(nodeB).remove(Integer.valueOf(nodeA));
        } else {
            System.out.println("One or both nodes do not exist");
        }
    }

    void deleteNode(int node) {
        if (g.containsKey(node)) {
            g.remove(node);
            for (List<Integer> values : g.values()) {
                values.remove(Integer.valueOf(node));
            }
        } else {
            System.out.println("Node does not exist");
        }
    }

    static void bfs(int start_node) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.offer(start_node);
        visited.add(start_node);

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            for (int relative : g.get(currentNode)) {
                if (!visited.contains(relative)) {
                    visited.add(relative);
                    queue.offer(relative);
                }
            }
        }
    }

    boolean isCyclic() {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> recStack = new HashSet<>();

        for (int i : g.keySet()) {
            if (hasCycle(i, visited, recStack)) {
                return true;
            }
        }
        return false;
    }

    boolean hasCycle(int node, Set<Integer> visited, Set<Integer> recStack) {
        if (recStack.contains(node)) {
            return true;
        }
        if (visited.contains(node)) {
            return false;
        }
    
        visited.add(node);
        recStack.add(node);
    
        for (int rel : g.getOrDefault(node, Collections.emptyList())) {
            if (hasCycle(rel, visited, recStack)) {
                return true;
            }
        }
        recStack.remove(node);
        return false;
    }
}

public class Class1_Q1Implementation {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addNode(1);
        graph.addNode(2);
        graph.addNode(3);
        graph.addNode(4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        // graph.addEdge(3, 1);
        // // graph.addEdge(1, 4);
        graph.print();
        System.out.println("Graph is cyclic : " + graph.isCyclic());
    }
}

// wed thur
// sat sun : test

// Graph : CRUD
// BFS,  DFS
// Weighted Graph 