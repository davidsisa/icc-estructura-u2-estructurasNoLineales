package main.Ejercicio_02_invert;

import main.materia.Models.Node;

public class InvertBinaryTree {
    private Node root;
//Metodos de invertTree en donde solamente ingresamos root, ya que suponemos que el arbol binario ya esta creado
//y solamente llamamos al metodo para cambiar de posiciones. En este caso lo que se hace es guardar en una 
//variable temporal, donde vamos guardamos los nodos de la izqueirda para poder invertirlos, no hace falta un bucle.
//Se utiliza la misma logica que al insertar los nodos.
    public void invertTree() {
        root = invertTree(root);
    }

    private Node invertTree(Node node) {
        if (node == null) {
            return null;
        }
        Node temp = node.getLeft();
        node.setLeft(invertTree(node.getRight()));
        node.setRight(invertTree(temp));

        return node; 
    }
    
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

}
