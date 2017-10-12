package com.example.cubikerouting;

/**
 * Created by Dan Volchek.
 */

import java.util.ArrayList;

public class Node {
    ArrayList<Edge> adjacent;
    String cityName;
    int index;

    public Node(String name) {
        cityName = name;
        adjacent = new ArrayList<>();
    }
}
