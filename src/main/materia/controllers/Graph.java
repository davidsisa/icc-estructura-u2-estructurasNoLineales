package main.materia.controllers;

import java.util.*;
import main.materia.Models.NodeG;

public class Graph {

    private List<NodeG> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeG addNode(int value) {
        NodeG newNode = new NodeG(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(NodeG src, NodeG dest) {
        src.addNeightbor(dest);
        dest.addNeightbor(src);

    }

    public void printGraph() {
        for (NodeG ptr : nodes) {
            System.out.println(" Vertice " + ptr.getValue() + ": ");
            for (NodeG nei : ptr.getNeighbors()) {
                System.out.println(" ->  " + nei.getValue());

            }
        }
    }

    public void addEdgeDirect(NodeG src, NodeG dest) {
        src.addNeightbor(dest);
    }

    public void getDFS(NodeG start) {
        Set<NodeG> visitados = new HashSet<>();
        System.out.println("DPS desde el nodo  " + start.getValue() + " : ");
        getDFSDirect(start, visitados);
    }

    private void getDFSDirect(NodeG node, Set<NodeG> visitados) {
        if (visitados.contains(node)) {
            return;
        }
        System.out.print(node.getValue() + " ");
        visitados.add(node);
        for (NodeG neigh : node.getNeighbors()) {
            getDFSDirect(neigh, visitados);
        }
    }

    public void getBFS(NodeG start) {
        Set<NodeG> visitados = new HashSet<>();
        Queue<NodeG> cola = new LinkedList<>();
        System.out.println();
        System.out.println("BFS desde el nodo  " + start.getValue() + " : " );
        cola.add(start);
        visitados.add(start);
        while (!cola.isEmpty()) {
            NodeG actual = cola.poll();
            System.out.print(actual.getValue() + " ");
            for (NodeG nei : actual.getNeighbors()) {
                if (!visitados.contains(nei)) {
                    visitados.add(nei);
                    cola.add(nei);
                }
            }
        }

    }
    public boolean getDFS(NodeG start,NodeG dest){
        
        Set<NodeG> visitados = new HashSet<>();
        return getDFSDirect(start,dest,visitados);
    
    }
        
            private boolean getDFSDirect(NodeG start, NodeG dest, Set<NodeG> visitados) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'getDFSDirect'");
            }

}
