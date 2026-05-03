package org.lessons.abstact;

public class Aquila extends Animale{
    
    public Aquila(String name){
        super(name);
    }

    public String verso(){
        return String.format("%s","Kreeee!");
    }

    public String mangia(){
        return String.format("%s","L'aquila è un predatore e mangia piccoli mammiferi, uccelli e rettili");
    }

}
