/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.graph4j.graph.traverse;

import java.util.Map;

/**
 *
 * @author abiniks
 */
public class BreadthFirstTree<V> {
    private Map<V, V> childToParentMap;
    private Map<V, Integer> singleSourceShortestPath;    

    public Map<V, V> getChildToParentMap() {
        return childToParentMap;
    }

    public void setChildToParentMap(Map<V, V> childToParentMap) {
        this.childToParentMap = childToParentMap;
    }

    public Map<V, Integer> getSingleSourceShortestPath() {
        return singleSourceShortestPath;
    }

    public void setSingleSourceShortestPath(Map<V, Integer> singleSourceShortestPath) {
        this.singleSourceShortestPath = singleSourceShortestPath;
    }        
}
