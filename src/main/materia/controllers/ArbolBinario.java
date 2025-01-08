package main.materia.controllers;

import main.materia.Models.Node;

public class ArbolBinario {
    private Node root;
    
    public void insert (int value){
        root =insert(root,value);
    } 
    private Node insert(Node node,int value){
        if(node == null)
            return new Node(value);
        
        return null;
    }
    public void printTree (){

    } 
    public void printTreeNode2 (Node root,String prefix,boolean isLeft){

    } 

}
