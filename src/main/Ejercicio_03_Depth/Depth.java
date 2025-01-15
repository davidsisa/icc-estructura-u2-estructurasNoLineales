package main.Ejercicio_03_Depth;

import main.materia.Models.Node;

public class Depth {

    private Node root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value); 
        }
        if (value < node.getValue()) {
            node.setLeft(insert(node.getLeft(), value)); 
        } else if (value > node.getValue()) {
            node.setRight(insert(node.getRight(), value));
        }
        return node; 
    }

    public void printTree() {
        printTreeNode2(root, "", true);
    }
    private void printTreeNode2(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.getValue());
            if (node.getLeft() != null || node.getRight() != null) {
                if (node.getLeft() != null) {
                    printTreeNode2(node.getLeft(), prefix + (isLeft ? "|   " : "    "), true);
                } else {
                    System.out.println(prefix + (isLeft ? "|   " : "    ") + "├── null");
                }
                if (node.getRight() != null) {
                    printTreeNode2(node.getRight(), prefix + (isLeft ? "|   " : "    "), false);
                } else {
                    System.out.println(prefix + (isLeft ? "|   " : "    ") + "└── null");
                }
            }
        }
    }

    public Node getRoot() {
        return root;
    }
    //Con la misma logica utilizamos la sobrecarga de metodos, con el mismo metodo recursivo, calculamos los nodos.
    //Al calcular los nodos de una fila devuelve los valores pero sumando 1, esto para calcular la profundidad.
    public int calculateDepth() {
        return calculateDepth(root);
    }
    private int calculateDepth(Node node) {
        if (node == null) {
            return 0; 
        }
        int leftDepth = calculateDepth(node.getLeft());
        int rightDepth = calculateDepth(node.getRight());
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
