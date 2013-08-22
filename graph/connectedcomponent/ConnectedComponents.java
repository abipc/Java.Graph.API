/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.graph4j.graph.connectedcomponent;

import java.util.Map;

/**
 *
 * @author abiniks
 */
public class ConnectedComponents<V> {
    private Map<V, Integer> nodeToConnectedCompIDMap;
    private Map<Integer, Integer> compIDToSizeMap;
    private int numConnectedComponents;
    
}
