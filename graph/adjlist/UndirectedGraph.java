/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.graph4j.graph.adjlist;

import org.graph4j.graph.Edge;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author abiniks
 */
public class UndirectedGraph<V> extends AbstractBaseGraph<V> {      
    
    private UndirectedGraph() {
        
    }
    
    public static <V> UndirectedGraph<V> createGraphFromInputFile(String inputFilePath) {
        return null;
    } 
    
//RELAX(u, v, w)
//  if d[v] > d[u] + w(u, v)
//     then d[v] ← d[u] + w(u, v)
//          π[v] ← u
    
//INITIALIZE-SINGLE-SOURCE(G, s)
//  for each vertex v ∈ V[G]
//       do d[v] ← ∞
//          π[v] ← NIL
//  d[s] 0
        
// DIJKSTRA(G, w, s)
//  INITIALIZE-SINGLE-SOURCE(G, s)
//  S ← Ø
//  Q ← V[G]
//  while Q ≠ Ø
//      do u ← EXTRACT-MIN(Q)
//         S ← S ∪{u}
//         for each vertex v ∈ Adj[u]
//             do RELAX(u, v, w)
   
    public static <V> Map<V, Double> dijkstraSP(UndirectedGraph<V> graph, V source) {
        Map<V, V> childToParentMap = new HashMap<>();
        final Map<V, Double> shortestPath = new HashMap<>();
        PriorityQueue<V> priorityQ = new PriorityQueue<>(10, new Comparator<V>() {
            @Override
            public int compare(V v1, V v2) {
                double dV1 = shortestPath.get(v1), dV2 = shortestPath.get(v2);
                if(dV1>dV2) {
                    return -1;
                } else if (dV2>dV1) {
                    return 1;
                } else
                    return 0;
            }
        });   
        
        /*
         * initialize single source
         */
        for(V aVertex : graph.adjList.keySet()) {
            shortestPath.put(aVertex, Double.MAX_VALUE);
            childToParentMap.put(aVertex, null);
            priorityQ.add(aVertex);
        }  
        
        while(!priorityQ.isEmpty()) {
            V aVertex = priorityQ.peek();
            for(Edge<V> edge: graph.adjList.get(aVertex)) {
                if(shortestPath.get(edge.getTarget()) > edge.getWeight() + shortestPath.get(aVertex)) {
                    shortestPath.put(edge.getTarget(), edge.getWeight() + shortestPath.get(aVertex));
                    childToParentMap.put(edge.getTarget(), aVertex);
                }
            }
            priorityQ.remove();
        }
                            
        return shortestPath;
    }
    
}
