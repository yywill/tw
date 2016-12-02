package com.throughtworks.williamyang.homework.problems.trains;

/**
 * Created by Administrator on 2016/12/1.
 */
public class DirectedEdge {
    private final char v;
    private final char w;
    private final int weight;

    public DirectedEdge(char v, char w, int weight) {
        if (Double.isNaN(weight)) throw new IllegalArgumentException("Weight is NaN");
        this.v = v;
        this.w = w;
        this.weight = weight;
    }

    public char from() {
        return v;
    }

    public char to() {
        return w;
    }

    public int weight() {
        return weight;
    }

    public String toString() {
        return v + "->" + w + " " + String.format("%5.2f", weight);
    }

}
