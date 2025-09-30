package org.zegai.dsa.graph;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        System.out.println(graph);
        System.out.println("Add Edge: " + graph.addEdge("A", "B"));
        System.out.println("Add Edge: " + graph.addEdge("A", "C"));
        System.out.println(graph);
        System.out.println("Remove Edge: " + graph.removeEdge("A", "B"));
        System.out.println(graph);
        System.out.println("Remove Vertex: " + graph.removeVertex("A"));
        System.out.println(graph);
    }
}
