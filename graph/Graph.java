/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.graph4j.graph;

import java.util.Set;

/**
 *
 * @author abiniks
 */
public class Graph {
    
    protected Set<Vertex> vertices;
    protected Set<Edge> edges;    

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
}
