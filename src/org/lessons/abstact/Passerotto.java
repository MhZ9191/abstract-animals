package org.lessons.abstact;

import org.lessons.interfaces.Vola;

public class Passerotto extends AbstractAnimale implements Vola{

    public Passerotto(String name){
        super(name);
    }

    @Override
    public String verso(){
        return String.format("%s","Ciirp Ciirp");
    }

    @Override
    public String mangia(){
        return String.format("%s","Il passerotto mangia principalmente semi, insetti e briciole");
    }

    @Override
    public void vola(){
        System.out.println("Sto iniziando a volare!");
    }

}
