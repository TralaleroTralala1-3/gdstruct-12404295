package com.gdstruct.module7;

public class Tree {
    private Node root;

    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node(value);

        }
        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }

    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }
    public Node getMin()
    {
        if (root == null)
        {
            return null;
        }
        return root.getMin();
    }

    public Node getMax()
    {
        if (root == null)
        {
            return null;
        }
        return root.getMax();
    }

    public void traverseInOrderDescending()
    {
        if (root != null)
        {
            root.traverseInOrderDescending();
        }
    }
}
