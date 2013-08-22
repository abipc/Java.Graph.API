/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.graph4j.graph;

/**
 *
 * @author abiniks
 */
public class Edge<V> {
    private V target;
    double weight;   

    public V getTarget() {
        return target;
    }

    public void setTarget(V target) {
        this.target = target;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }  
}