package com.throughtworks.williamyang.homework.solutions;

import com.throughtworks.williamyang.homework.problems.trains.DirectedEdge;
import com.throughtworks.williamyang.homework.problems.trains.EdgeWeightedDigraph;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Logger;

//Simple Digraph Problem
public class ProblemOneSolution {

    final static Logger log = Logger.getLogger(ProblemOneSolution.class.getName());
      static EdgeWeightedDigraph g ;

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
    @BeforeClass
    public static void input(){
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
    public void solve01(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','B','C'})));
    }

    @Test
    public void solve02(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','D' })));
    }

    @Test
    public void solve03(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','D','C'})));
    }

    @Test
    public void solve04(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','E','B','C','D'})));
    }

    @Test
    public void solve05(){
        System.out.println(convertOutput(g.computeWeight(new char[]{'A','E','D'})));
    }


    @Test
    public void solve06(){
        System.out.println(convertOutput(g.search('C','C',3,-1)));
    }

    @Test
    public void solve07(){
        System.out.println(convertOutput(g.deepSearch('A','C',4,0)));
    }

    @Test
    public void solve08(){
        System.out.println(convertOutput(g.shortestPath('A','C')));
    }

    @Test
    public void solve09(){
        System.out.println(convertOutput(g.shortestPath('B','B')));
    }

    @Test
    public void solve10(){
        System.out.println(convertOutput(g.sumPathes('C','C',30)));
    }

}
