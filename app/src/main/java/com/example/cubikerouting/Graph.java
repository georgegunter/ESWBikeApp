package com.example.cubikerouting;

/**
 * Created by George Gunter on 10/10/17.
 */

import java.util.ArrayList;
import java.util.HashMap;

import static android.R.attr.data;

public class Graph {

    public ArrayList<Node> nodeList;

    public Graph(ArrayList<Node> newNodeList){
        nodeList = newNodeList;
    }

    private ArrayList<Edge> pathFind(Node startNode,Node endNode){

        ArrayList<Node> unvisited = new ArrayList<>();//Keep track of what hasn't been visited
        HashMap<Node, Double> cost = new HashMap<>();//current estimate of distance
        HashMap<Node, Edge> parent = new HashMap<>();//Like previous

        for (Node n : nodeList) {//iterate through nodes
            cost.put(n, Double.POSITIVE_INFINITY);
            parent.put(n,null);
            unvisited.add(n);
        }

        cost.put(startNode, 0.0);

        while (unvisited.size() != 0){

            for (Node n : nodeList){
                
            }
        }



        return null;





    }





}
