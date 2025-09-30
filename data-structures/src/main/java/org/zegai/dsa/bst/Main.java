package org.zegai.dsa.bst;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.insert(4));
        System.out.println(bst.insert(7));
        System.out.println(bst.insert(10));
        System.out.println(bst.insert(2));
        System.out.println(bst.insert(100));
        System.out.println(bst.insert(6));
        System.out.println(bst.insert(6));
        System.out.println(bst);

        System.out.println(bst.contains(1));
        System.out.println(bst.contains(100));
        System.out.println(bst.contains(4));
        System.out.println(bst.contains(7));
        System.out.println(bst.contains(9));
    }
}
