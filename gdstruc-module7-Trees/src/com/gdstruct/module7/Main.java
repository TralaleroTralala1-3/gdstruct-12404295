package com.gdstruct.module7;

public class Main {

    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.insert(12);
        tree.insert(43);
        tree.insert(29);
        tree.insert(64);
        tree.insert(5);
        tree.insert(18);

        System.out.println("=== In-Order (Ascending) ===");
        tree.traverseInOrder();

        System.out.println("\n=== In-Order (Descending) ===");
        tree.traverseInOrderDescending();

        System.out.println("\n=== Smallest Value ===");
        Node minNode = tree.getMin();
        if (minNode != null)
            System.out.println(minNode.getData());

        System.out.println("\n=== Largest Value ===");
        Node maxNode = tree.getMax();
        if (maxNode != null)
            System.out.println(maxNode.getData());
    }
}
