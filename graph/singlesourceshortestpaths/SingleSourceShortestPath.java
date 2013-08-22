/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.graph4j.graph.singlesourceshortestpaths;

import java.util.HashMap;
import java.util.Map;
import org.graph4j.graph.Graph;

/**
 *
 * @author abiniks
 */
public class SingleSourceShortestPath<V> {
    private Map<V, V> childToParentMap = new HashMap<>();
    private Map<V, Double> shortestPath = new HashMap<>();
    
    public static <V> SingleSourceShortestPath<V> getDijkstraShortestPath(Graph g) {
        return null;
    }
    
    public static <V> SingleSourceShortestPath<V> getBellmanFordShortestPath(Graph g) {
        return null;
    }

    public Map<V, V> getChildToParentMap() {
        return childToParentMap;
    }

    public void setChildToParentMap(Map<V, V> childToParentMap) {
        this.childToParentMap = childToParentMap;
    }

    public Map<V, Double> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(Map<V, Double> shortestPath) {
        this.shortestPath = shortestPath;
    }    
}
