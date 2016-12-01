package com.throughtworks.williamyang.homework.problem1;

import org.junit.BeforeClass;
import org.junit.Test;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

/**
 The distance of the route A-B-C.
 The distance of the route A-D.
 The distance of the route A-D-C.
 The distance of the route A-E-B-C-D.
 The distance of the route A-E-D.
 The number of trips starting at C and ending at C with a maximum of 3 stops.  In the sample data below, there are two such trips: C-D-C (2 stops). and C-E-B-C (3 stops).
 The number of trips starting at A and ending at C with exactly 4 stops.  In the sample data below, there are three such trips: A to C (via B,C,D); A to C (via D,C,D); and A to C (via D,E,B).
 The length of the shortest route (in terms of distance to travel) from A to C.
 The length of the shortest route (in terms of distance to travel) from B to B.
 The number of different routes from C to C with a distance of less than 30.  In the sample data, the trips are: CDC, CEBC, CEBCDC, CDCEBC, CDEBC, CEBCEBC, CEBCEBCEBC.
 */
public class TestCase {

    final static Logger log = Logger.getLogger(TestCase.class.getName());
      static EdgeWeightedDigraph g ;

    @BeforeClass
    public static void init(){
        //AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
        g = new EdgeWeightedDigraph();
        g.addEdge(new DirectedEdge('A','B',5));
        g.addEdge(new DirectedEdge('B','C',4));
        g.addEdge(new DirectedEdge('C','D',8));
        g.addEdge(new DirectedEdge('D','C',8));
        g.addEdge(new DirectedEdge('D','E',6));
        g.addEdge(new DirectedEdge('A','D',5));
        g.addEdge(new DirectedEdge('C','E',2));
        g.addEdge(new DirectedEdge('E','B',3));
        g.addEdge(new DirectedEdge('A','E',7));
    }

    public static String convertOutput(int i) {
        return i == 0 ? "NO SUCH ROUTE" : String.valueOf(i);
    }

    @Test
    public void test01(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','B','C'})));
    }

    @Test
    public void test02(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','D' })));
    }

    @Test
    public void test03(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','D','C'})));
    }

    @Test
    public void test04(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','E','B','C','D'})));
    }

    @Test
    public void test05(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','E','D'})));
    }



}
