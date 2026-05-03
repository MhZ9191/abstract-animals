package org.lessons.abstact;

public abstract class Animale {

    private String name;

    public Animale(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    
    public void dormi(){
        System.out.println("ZzZz");
    };

    abstract String verso();
    abstract String mangia();

}
