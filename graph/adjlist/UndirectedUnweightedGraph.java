/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.graph4j.graph.adjlist;

import org.graph4j.graph.traverse.DepthFirstForest;
import org.graph4j.graph.traverse.BreadthFirstTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UndirectedUnweightedGraph<V>{
    
    private Set<V> vertices;
    private Map<V, ArrayList<V>> adjacencyList;
    
    /*
     * Encourage use of static factory methods.
     */
    private UndirectedUnweightedGraph() {
        
    }
    
    private UndirectedUnweightedGraph(Set<V> vertices) {
        this.vertices = vertices;
    }
    
    public static <V> UndirectedUnweightedGraph<V> createEmptyGraphFromVertices(Set<V> vertices) {
        if (vertices.isEmpty()) throw new IllegalArgumentException("Number of vertices must be positive");
        UndirectedUnweightedGraph graph = new UndirectedUnweightedGraph(vertices);
        graph.adjacencyList = new HashMap<>();
        
        for(V aVertex : vertices) {
            ArrayList<V> list = (ArrayList<V>)graph.adjacencyList.get(aVertex);
            if(null == list) {
                list = new ArrayList<>();
                graph.adjacencyList.put(aVertex, list);
            }            
        }
        return graph;
    }    

    public static <V> UndirectedUnweightedGraph createRandomUnweightedUndirectedGraph(Set<V> vertices, int E) {
        UndirectedUnweightedGraph g = createEmptyGraphFromVertices(vertices);
        int size = vertices.size();
        if (E < 0) throw new IllegalArgumentException("Number of edges must be positive");
        List<V> tempList = new ArrayList<>();
        tempList.addAll(vertices);
        for (int i = 0; i < E; i++) {
            int v = (int) (Math.random() * size);
            int w = (int) (Math.random() * size);
            g.addEdge(tempList.get(v), tempList.get(w));
        }
        return g;
    }
    
    public static <V> BreadthFirstTree<V> doBFS(V source, UndirectedUnweightedGraph<V> graph) {
        Map<V, V> childToParentMap;
        Map<V, Integer> nodeToColorMap;
        Map<V, Integer> nodeToDiscoverTimeMap;
        Map<V, Integer> nodeToFinishTimeMap;        
        Map<V, Integer> singleSourceShortestPath;  
        BreadthFirstTree<V> result = new BreadthFirstTree<>();
        return result;
    }
    
    public static <V> DepthFirstForest<V> doDFS(UndirectedUnweightedGraph<V> graph) {
        Map<V, V> childToParentMap;
        Map<V, Integer> nodeToColorMap;
        int time=0;
        Map<V, Integer> singleSourceShortestPath;  
        DepthFirstForest<V> result = new DepthFirstForest<>();
        return result;
    } 
    
    public static <V> UndirectedUnweightedGraph<V> createGraphFromInputFile(String inputFilePath) {
        return null;
    }
    
    public void addEdge(V v, V w) {
        adjacencyList.get(v).add(w);
        adjacencyList.get(w).add(v);
    }         

    public Map<V, ArrayList<V>> getAdjacencyList() {
        return adjacencyList;
    }          
}


