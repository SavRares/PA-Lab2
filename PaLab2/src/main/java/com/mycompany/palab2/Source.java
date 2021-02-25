/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.palab2;


/**
 *
 * @author Rares
 */
public class Source {
    private String name;
    private SourceType type;
    public Source() { }
    
    public Source(String name, SourceType type) {
     this.name = name;
     this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SourceType getType() {
        return type;
    }

    public void setType(SourceType type) {
        this.type = type;
    }
    
    public String toString() {
     return name;
    }
}
