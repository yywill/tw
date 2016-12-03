package com.throughtworks.williamyang.homework.problems.trains;

import java.util.*;

/**
 * Created by Administrator on 2016/12/1.
 */
public class EdgeWeightedDigraph {
    private static final String NEWLINE = System.getProperty("line.separator");

    private int v;                // number of vertices in this digraph
    private int e;                // number of edges in this digraph
    private Map<Character,List<DirectedEdge>> adj = new HashMap<Character, List<DirectedEdge>>(128);    // adj[v] = adjacency list for vertex v

    private int maxWeight =0;



    public int V() {
        return v;
    }

    public int E() {
        return e;
    }

    // throw an IllegalArgumentException unless {@code 0 <= v < v}
    private void validateVertex(int v) {
        if (v < 0  )
            throw new IllegalArgumentException("vertex " + v + " is not between 0 and " + (this.v -1));
    }


    public void addEdge(DirectedEdge e) {
        char v = e.from();
        char w = e.to();
        validateVertex(v);
        validateVertex(w);
        if (adj.get(v)==null)
            adj.put(v,new ArrayList<DirectedEdge>());
        adj.get(v).add(e);
        this.e++;
        this.maxWeight += e.weight();

    }

    public Iterable<DirectedEdge> adj(int v) {
        validateVertex(v);
        return adj.get(v);
    }


    public Iterable<DirectedEdge> edges() {
        Collection<DirectedEdge> list = new ArrayList<DirectedEdge>();
        for (int v = 0; v < this.v; v++) {
            for (DirectedEdge e : adj(v)) {
                list.add(e);
            }
        }
        return list;
    }

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

    // exclude circles !
    // left:  <0 as null
    //         >0 as left stop to count
    public int search (char a, char b , int max, int left){
        int searchCount = max;
        Iterator<DirectedEdge> it = adj.get(a).iterator();
        int count =0;
        while(it.hasNext()){
            DirectedEdge edge = it.next();
            if (edge.to()==b){
                if (left <0 ||left+1 == max)
                count ++;
            }else{
                if (searchCount >1)
                count += search(edge.to(),b,searchCount-1,left);
            }
        }
        return count;
    }

    //include circles !
    // left:  <0 as null
    //         >0 as left stop to count
    public int deepSearch (char a, char b , int max, int left){
        int searchCount = max;
        Iterator<DirectedEdge> it = adj.get(a).iterator();
        int count =0;
        while(it.hasNext()){
            DirectedEdge edge = it.next();
            if (edge.to()==b){
                if (left <0 ||left+1 == max)
                    count ++;
                else
                    count += deepSearch(edge.to(),b,searchCount-1,left);
            }else{
                if (searchCount >1)
                    count += deepSearch(edge.to(),b,searchCount-1,left);
            }
        }
        return count;
    }


    public int search (char a, char b , int max, int left, int weight, PriorityQueue<Integer> queue){
        int searchCount = max;
        Iterator<DirectedEdge> it = adj.get(a).iterator();
        int count =0;
        while(it.hasNext()){
            DirectedEdge edge = it.next();
            if (edge.to()==b){
                if (left <0 ||left+1 == max){
                    count ++;
                    queue.add(weight+edge.weight());
                }

            }else{
                if (searchCount >1)
                    count += search(edge.to(),b,searchCount-1,left, edge.weight()+weight,queue);
            }
        }
        return count;
    }

    public int shortestPath(char a, char b ){
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        int search = search(a, b, e, -1, 0, queue);
        return queue.poll();
    }


    //init condition: maxWeight == left
    protected int sumPathes (char a, char b , int maxWeight, int left, PriorityQueue<Integer> queue){
        Iterator<DirectedEdge> it = adj.get(a).iterator();
        int count =0;
        while(it.hasNext()){
            DirectedEdge edge = it.next();
            if (left <= edge.weight())
                return 0;
            if (edge.to()==b){
                    count ++;
                    queue.add(maxWeight-left+edge.weight());
                    count += sumPathes(edge.to(),b,maxWeight, left-edge.weight(),queue);


            }else{

                   count += sumPathes(edge.to(),b,maxWeight, left-edge.weight(),queue);
            }
        }
        return count;
    }

    public int sumPathes(char a, char b , int maxWeight){
        return sumPathes(a,b,maxWeight,maxWeight,new PriorityQueue<Integer>());
    }

    public int searchAtLeast(char a, char b, int max) {
        return search(a,b,max,-1);
    }

    public int deepSearchExact(char a, char b, int max) {
        return deepSearch(a,b,max,0);
    }
}
