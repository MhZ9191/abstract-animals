package org.lessons.abstact;

public class Passerotto extends Animale {

    public Passerotto(String name){
        super(name);
    }

    public String verso(){
        return String.format("%s","Ciirp Ciirp");
    }

    public String mangia(){
        return String.format("%s","Il passerotto mangia principalmente semi, insetti e briciole");
    }
}
