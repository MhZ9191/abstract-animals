package org.lessons.abstact;

import org.lessons.interfaces.Vola;

public class Passerotto extends Animale implements Vola{

    public Passerotto(String name){
        super(name);
    }

    public String verso(){
        return String.format("%s","Ciirp Ciirp");
    }

    public String mangia(){
        return String.format("%s","Il passerotto mangia principalmente semi, insetti e briciole");
    }

    public void vola(){
        System.out.println("Sto iniziando a volare!");
    }

}
