/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palab2;

import java.io.*;
import java.util.*;

/**
 *
 * @author Rares
 */
public class Problem {
    private Source[] sources;
    private Destination[] destinations;
    private int supply[];
    private int demand[];
    private int cost[][];

    public Problem() { }
    
    
    
    public Source[] getSources() {
        return sources;
    }

    public boolean setSources(Source[] sources) {
        for(int i = 0; i<sources.length-1;i++){
            for(int j=i+1; j<sources.length;j++){
                if(sources[i].equals(sources[j]))
                    return false;
            }
        }
        this.sources = sources;
        return true;
    }

    public Destination[] getDestinations() {
        return destinations;
    }

    public boolean setDestinations(Destination[] destinations) {
         for(int i = 0; i<destinations.length-1;i++){
            for(int j=i+1; j<destinations.length;j++){
                if(destinations[i].equals(destinations[j]))
                    return false;
            }
        }
        this.destinations = destinations;
        return true;
    }

    public int[] getSupply() {
        return supply;
    }

    public void setSupply(int[] supply) {
        this.supply = supply;
    }

    public int[] getDemand() {
        return demand;
    }

    public void setDemand(int[] demand) {
        this.demand = demand;
    }

    public int[][] getCost() {
        return cost;
    }

    public void setCost(int[][] cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Problem{" + "sources=" + Arrays.toString(sources) + ", destinations=" +  Arrays.toString(destinations) + ", supply=" +  Arrays.toString(supply) + ", demand=" +  Arrays.toString(demand) + ", cost=" + Arrays.toString(cost);
    }
    
    
    
}
