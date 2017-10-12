package com.example.cubikerouting;

/**
 * Created by Dan Volcheck.
 */

public class Edge {
    Node endNode;
    Node startNode;
    double distance;
    //May want to add additional metrics here for edges besides distance, such as quality of raod

    public Edge(Node startNode, Node endNode, double distance) {
        this.startNode=startNode;
        this.endNode = endNode;
        this.distance = distance;
    }
}
