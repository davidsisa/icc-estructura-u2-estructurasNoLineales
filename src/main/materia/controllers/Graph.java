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
}
