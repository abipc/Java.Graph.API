/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.graph4j.graph.adjlist;

import org.graph4j.graph.Vertex;
import org.graph4j.graph.Edge;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author abiniks
 */
public abstract class AbstractBaseGraph<V> {
    
    protected Set<Vertex> vertices;
    protected Set<Edge> edges;
    protected Map<V, Set<Edge>> adjList;
    
    protected static final boolean adjListImpl = Boolean.TRUE;

    public Set<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(Set<Vertex> vertices) {
        this.vertices = vertices;
    }

    public Set<Edge> getEdges() {
        return edges;
    }

    public void setEdges(Set<Edge> edges) {
        this.edges = edges;
    }

    public Map<V, Set<Edge>> getAdjList() {
        return adjList;
    }

    public void setAdjList(Map<V, Set<Edge>> adjList) {
        this.adjList = adjList;
    }  

    public boolean isAdjListImpl() {
        return adjListImpl;
    }    
}
