package org.lessons.abstact;

public abstract class AbstractAnimale {

    private String name;

    public AbstractAnimale(String name){
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
