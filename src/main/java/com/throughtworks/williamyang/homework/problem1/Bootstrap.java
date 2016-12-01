package com.throughtworks.williamyang.homework.problem1;

import java.util.StringTokenizer;

/**
 * Created by Administrator on 2016/12/1.
 */
public class Bootstrap {

    static StringTokenizer st;

    public static void main(String[] args) {
        EdgeWeightedDigraph diagraph = new EdgeWeightedDigraph();
        for (String s : args){
            st = new StringTokenizer(s,",");

            while (st.hasMoreTokens()) {
                String point = st.nextToken();
                char a = point.charAt(0);
                char b = point.charAt(1);
                int weight = Integer.parseInt(point.substring(2, point.length()));

                DirectedEdge e =new DirectedEdge(a,b,weight);
                diagraph.addEdge(e);
            }
        }

        char a = 'a';
        char b = 'b';

        // compute shortest paths
        Dijkstra sp = new Dijkstra(diagraph, a);

            if (sp.hasPathTo(b)) {
                System.out.printf("%d to %d (%.2f)  ", a, b, sp.distTo(b));
                for (DirectedEdge e : sp.pathTo(b)) {
                    System.out.print(e + "   ");
                }
                System.out.println();
            }
    }
}
