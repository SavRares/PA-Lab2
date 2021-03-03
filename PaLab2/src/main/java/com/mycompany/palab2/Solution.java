/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palab2;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Clasa solutie este folosita pentru generarea unei solutii prin intermediul metodei computeCost.
 * Metoda computeCost ia datele aferente problemei, si se foloseste de Stream API pentru a sti cand executia s-a terminat.
 * Cand mai existe elemente in vectorul demand nenule, algoritmul cauta cel mai mic element din matrice care nu a mai fost selectat pana acum, verifica vectorii demand si supply pentru indecsi, si daca totul e bine, totalul se updateaza. 
 * 
 * @param problem un obiect de tipul Problem care a fost instantiat in main si care cuprinde datele problemei
 * @return total Totalul costului aferent distributiei de la sources la destinations.
 * @author Rares
 */
public class Solution {
    private int[][] x;
    
    public Solution() { }

    public int[][] getX() {
        return x;
    }

    public void setX(int[][] x) {
        this.x = x;
    }
    
    
    public int computeCost(Problem problem){
        int[][] cost = this.x;
        int total = 0;
        int[] demand = problem.getDemand();
        int[] supply = problem.getSupply();
        while(Arrays.stream(demand).sum()>0){
            int min = cost[0][0];
            int minIndexI = 0;
            int minIndexJ = 0;
            for(int i=0; i<supply.length;i++){
                 for(int j=0; j<demand.length;j++){
                     if(cost[i][j]>=0){
                         if(min<0){
                             min = cost[i][j];
                             minIndexI = i;
                             minIndexJ = j;
                         }
                         else{
                             if(cost[i][j]<min){
                                 min = cost[i][j];
                                 minIndexI = i;
                                 minIndexJ = j;
                             }
                         }
                     }
                }
            }
            cost[minIndexI][minIndexJ] = -1;
            if(supply[minIndexI] >= demand[minIndexJ]){
                total += min*demand[minIndexJ];
                supply[minIndexI] -= demand[minIndexJ];
                demand[minIndexJ] = 0;
            }
            else{
                total += min*supply[minIndexI];
                demand[minIndexJ] -= supply[minIndexI];
                supply[minIndexI] = 0;
          }
        }
        return total;
    }
    
    
    
}
