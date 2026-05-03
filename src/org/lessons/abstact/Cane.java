package org.lessons.abstact;

public class Cane extends AbstractAnimale{
    
    private String taglia;

    public Cane(String name){
        super(name);
    }

    public Cane(String name,String taglia){
        super(name);
        this.taglia=taglia;
    }

    public String getTaglia(){
        return this.taglia;
    }

    public void setTaglia(String taglia){
        this.taglia=taglia;
    }

    @Override
    public String verso(){
        return String.format("%s","Bauu!");
    }

    @Override
    public String mangia(){
        return String.format("%s","Il cane è onnivoro con tendenza carnivora");
    }

}
