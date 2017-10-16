package com.example.cubikerouting;

/**
 * Created by Dan Volchek.
 */

public class Edge {
    private Node endNode;
    private Node startNode;
    private int weight;
    //May want to add additional metrics here for edges besides distance, such as quality of road

    public Edge(Node startNode, Node endNode, double distance) {
        this.startNode=startNode;
        this.endNode = endNode;
        this.weight = weight;
    }

    public Node getStart(){
        return  startNode;
    }

    public Node getEnd(){
        return  endNode;
    }

    public int getWeight(){
        return weight;
    }
}
