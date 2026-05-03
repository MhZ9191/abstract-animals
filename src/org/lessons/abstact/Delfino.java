package org.lessons.abstact;

public class Delfino extends Animale{
    
    public Delfino(String name){
        super(name);
    }

    public String verso(){
        return String.format("%s","Fiiiiu!");
    }

    public String mangia(){
        return String.format("%s","Il delfino mangia pesci, calamari e piccoli crostacei");
    }

}
