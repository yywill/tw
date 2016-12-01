package com.throughtworks.williamyang.homework.problem1;

import java.util.*;

/**
 * Created by Administrator on 2016/12/1.
 */
public class EdgeWeightedDigraph {
    private static final String NEWLINE = System.getProperty("line.separator");

    private int v;                // number of vertices in this digraph
    private int e;                      // number of edges in this digraph
    private Map<Character,List<DirectedEdge>> adj = new HashMap(128);    // adj[v] = adjacency list for vertex v
    private int[] indegree;             // indegree[v] = indegree of vertex v




    /**
     * Returns the number of vertices in this edge-weighted digraph.
     *
     * @return the number of vertices in this edge-weighted digraph
     */
    public int V() {
        return v;
    }

    /**
     * Returns the number of edges in this edge-weighted digraph.
     *
     * @return the number of edges in this edge-weighted digraph
     */
    public int E() {
        return e;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < v}
    private void validateVertex(int v) {
        if (v < 0  )
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (this.v -1));
    }

    /**
     * Adds the directed edge {@code e} to this edge-weighted digraph.
     *
     * @param  e the edge
     * @throws IllegalArgumentException unless endpoints of edge are between {@code 0}
     *         and {@code v-1}
     */
    public void addEdge(DirectedEdge e) {
        char v = e.from();
        char w = e.to();
        validateVertex(v);
        validateVertex(w);
        if (adj.get(v)==null)
            adj.put(v,new ArrayList());
        adj.get(v).add(e);
        this.e++;
    }

    public Iterable<DirectedEdge> adj(int v) {
        validateVertex(v);
        return adj.get(v);
    }

    /**
     * Returns the number of directed edges incident from vertex {@code v}.
     * This is known as the <em>outdegree</em> of vertex {@code v}.
     *
     * @param  v the vertex
     * @return the outdegree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < v}
     */
    public int outdegree(int v) {
        validateVertex(v);
        return adj.get(v).size();
    }

    /**
     * Returns the number of directed edges incident to vertex {@code v}.
     * This is known as the <em>indegree</em> of vertex {@code v}.
     *
     * @param  v the vertex
     * @return the indegree of vertex {@code v}
     * @throws IllegalArgumentException unless {@code 0 <= v < v}
     */
    public int indegree(int v) {
        validateVertex(v);
        return indegree[v];
    }

    /**
     * Returns all directed edges in this edge-weighted digraph.
     * To iterate over the edges in this edge-weighted digraph, use foreach notation:
     * {@code for (DirectedEdge e : G.edges())}.
     *
     * @return all edges in this edge-weighted digraph, as an iterable
     */
    public Iterable<DirectedEdge> edges() {
        Collection<DirectedEdge> list = new ArrayList<DirectedEdge>();
        for (int v = 0; v < this.v; v++) {
            for (DirectedEdge e : adj(v)) {
                list.add(e);
            }
        }
        return list;
    }

    /**
     * Returns a string representation of this edge-weighted digraph.
     *
     * @return the number of vertices <em>v</em>, followed by the number of edges <em>e</em>,
     *         followed by the <em>v</em> adjacency lists of edges
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(v + " " + e + NEWLINE);
        for (int v = 0; v < this.v; v++) {
            s.append(v + ": ");
            for (DirectedEdge e : adj.get(v)) {
                s.append(e + "  ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    public int computeWeight(char a, char b){
        int weight = 0;
        Iterator<DirectedEdge> it = adj.get(a).iterator();
        while(it.hasNext()){
            DirectedEdge edge = it.next();
            if (edge.to()==b){
                return  edge.weight();
            }
        }
        return 0;
    }

    public int computeWeight(char[] a){
        int weight = 0;
        int tmpWeight = 0;
        if (a.length < 2)
            return 0;
        for (int i = 0; i < a.length-1; i++){
            tmpWeight = computeWeight(a[i],a[i+1]) ;
            if (tmpWeight == 0)
                return 0;
            else
                weight += tmpWeight;
        }
       return weight;
    }

}
