package org.lessons.abstact;

import org.lessons.interfaces.Vola;

public class Aquila extends AbstractAnimale implements Vola{
    
    public Aquila(String name){
        super(name);
    }

    @Override
    public String verso(){
        return String.format("%s","Kreeee!");
    }

    @Override
    public String mangia(){
        return String.format("%s","L'aquila è un predatore e mangia piccoli mammiferi, uccelli e rettili");
    }

    @Override
    public void vola(){
        System.out.println("Sto volando");
    }

}
