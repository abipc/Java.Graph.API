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
public class DepthFirstForest<V> {
    private Map<V, Integer> nodeToDiscoverTimeMap;
    private Map<V, Integer> nodeToFinishTimeMap;
    private Map<V, V> childToParentMap;
    
}
