package org.zegai.algorithms.graph.dfs;
/*

Example for test:
    0
   /  \
  1    2
 / \   |
3  4   5


*/


public class DFSDemo {

    public static void main(String[] args) {
        DFS dfs = new DFS(7); // Initialize by number of node

        // Adding node to graph (adjacent list)
        dfs.add(0, 2);
        dfs.add(0, 1);
        dfs.add(1, 4);
        dfs.add(1, 3);
        dfs.add(1, 0);
        dfs.add(2, 5);
        dfs.add(2, 0);
        dfs.add(3, 1);
        dfs.add(4, 1);
        dfs.add(5, 2);

        // visit all node
        dfs.explore(0);

        // search
        int searchValue = 4;
        boolean isFounded = dfs.search(0, searchValue);
        System.out.println(searchValue + (isFounded ? " is found" : " cannot found"));
    }
}
