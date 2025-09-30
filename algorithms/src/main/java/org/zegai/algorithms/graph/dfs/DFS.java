package org.zegai.algorithms.graph.dfs;

import java.util.Stack;

// Depth First Search (search in graph)
public class DFS {

    private int size; // Number of node
    private AdjList[] array;

    public DFS(int size) {
        this.size = size;
        array = new AdjList[this.size];
        for (int i = 0; i < size; i++) {
            array[i] = new AdjList();
            array[i].setHead(null);
        }
    }

    public void add(int src, int value) {
        Node node = new Node(value, null);
        node.setNext(array[src].getHead());
        array[src].setHead(node);
    }

    public void explore(int startVertex) { // browse (visit) all nodes
        Boolean[] visited = new Boolean[this.size];
        for (int i = 0; i < visited.length; i++) // Initialize table of visited by false
            visited[i] = false;

        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.empty()) {
            int n = stack.pop();
            stack.push(n);
            visited[n] = true;
            Node head = array[n].getHead();
            boolean isDone = true;
            while (head != null) {
                if (visited[head.getValue()] == false) {
                    stack.push(head.getValue());
                    visited[head.getValue()] = true;
                    isDone = false;
                    break;
                } else
                    head = head.getNext();
            }

            if (isDone) {
                int nOut = stack.pop();
                System.out.println("Visit node: " + nOut);
            }
        }
    }

    public boolean search(int startVertex, int searchValue) { // browse (visit) all nodes
        Boolean[] visited = new Boolean[this.size];
        for (int i = 0; i < visited.length; i++) // Initialize table of visited by false
            visited[i] = false;

        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while (!stack.empty()) {
            int n = stack.pop();
            stack.push(n);
            visited[n] = true;
            Node head = array[n].getHead();
            boolean isDone = true;
            while (head != null) {
                if (head.getValue() == searchValue) // If value is found
                    return true;

                if (visited[head.getValue()] == false) {
                    stack.push(head.getValue());
                    visited[head.getValue()] = true;
                    isDone = false;
                    break;
                } else
                    head = head.getNext();
            }

            if (isDone) {
                int nOut = stack.pop();
                System.out.println("Visit node: " + nOut);
            }
        }
        return false;
    }
}
