/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palab2;

/**
 * Am instantiat toate clasele pentru problema data, si fiecare lista pentru clasa problema. Avem instantiata o clasa solutie pentru solutia problemei
 * @author Rares
 */
public class Main {
    public static void main(String[] args){
        
        
        Problem problem = new Problem();
        
        Source[] sources = new Source[2];
        sources[0]= new Warehouse();
        sources[1]= new Factory();
        
        sources[0].setName("S1");
        sources[1].setName("S2");
        
        if(problem.setSources(sources)){
            System.out.println("E bine!");
        }
        else{
            System.out.println("Un obiect sources a fost adaugat de 2 ori!");
            return;
        }
 
        
        Destination d1 = new Destination("D1");
        Destination d2 = new Destination("D2");
        Destination d3 = new Destination("D3");
        
        Destination destinations[] = {d1, d2, d3};
        
        if(problem.setDestinations(destinations)){
            System.out.println("Toate destinatiile sunt diferite!");
        }
        else{
            System.out.println("Un obiect destination a fost adaugat de 2 ore!");
            return;
        }
        
        int demand[] = {20, 25, 25};
        int supply[] = {10, 35, 25};
        int cost[][] = {{2, 3, 1}, {5, 4, 8}, {5, 6, 8}};
        
        problem.setDemand(demand);
        problem.setSupply(supply);
        problem.setCost(cost);
       
        
        Solution solution = new Solution();
        solution.setX(cost);
        System.out.println(solution.computeCost(problem));
        
    }
}
