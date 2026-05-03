package org.lessons.abstact;

import org.lessons.interfaces.Vola;

public class Aquila extends Animale implements Vola{
    
    public Aquila(String name){
        super(name);
    }

    public String verso(){
        return String.format("%s","Kreeee!");
    }

    public String mangia(){
        return String.format("%s","L'aquila è un predatore e mangia piccoli mammiferi, uccelli e rettili");
    }

    public void vola(){
        System.out.println("Sto volando");
    }

}
