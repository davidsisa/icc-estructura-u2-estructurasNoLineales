package main.materia.controllers;

import java.util.*;

import main.materia.Models.NodeG;

public class Graph {
    private List<NodeG> nodes;
    public Graph (){
        this.nodes = new ArrayList<>();
    }
    public NodeG addNode(int value){
        NodeG newNode = new NodeG(value);
        nodes.add(newNode);
        return newNode;
    }
    public void addEdge(NodeG src, NodeG dest){
        src.addNeightbor(dest);
        dest.addNeightbor(src);
    
    }
    public void printGraph(){
        for (NodeG ptr: nodes) {
            System.out.println(" Vertice " + ptr.getValue() + ": ");
            for (NodeG nei : ptr.getNeighbors()) {
                System.out.println(nei.getValue() +" - ");
                System.out.println();
            }
        }
    }
}
