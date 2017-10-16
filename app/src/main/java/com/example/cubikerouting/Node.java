package com.example.cubikerouting;

/**
 * Created by Dan Volchek.
 */

import java.util.ArrayList;

import static android.R.attr.name;

public class Node<data> {
    ArrayList<Edge> adjacent;
    data Data;
    boolean discovered;

    public Node(data newData,ArrayList<Edge> newAdjacent) {
        Data = newData;
        adjacent = newAdjacent;
        discovered = false;
    }

    public ArrayList<Edge> getAdjacent(){
        return  adjacent;
    }

    public void addAdjacent(Edge newAdj){
        adjacent.add(newAdj);
    }

    public void setDiscovered(){
        discovered = true;
    }
}
