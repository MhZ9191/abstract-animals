package org.lessons.abstact;
import org.lessons.interfaces.Nuota;
public class Delfino extends Animale implements Nuota{
    
    public Delfino(String name){
        super(name);
    }

    public String verso(){
        return String.format("%s","Fiiiiu!");
    }

    public String mangia(){
        return String.format("%s","Il delfino mangia pesci, calamari e piccoli crostacei");
    }

    public void nuota(){
        System.out.println("Sto nuotando!");
    }

}
