package org.lessons.abstact;
import org.lessons.interfaces.Nuota;
public class Delfino extends AbstractAnimale implements Nuota{
    
    public Delfino(String name){
        super(name);
    }

    @Override
    public String verso(){
        return String.format("%s","Fiiiiu!");
    }

    @Override
    public String mangia(){
        return String.format("%s","Il delfino mangia pesci, calamari e piccoli crostacei");
    }

    @Override
    public void nuota(){
        System.out.println("Sto nuotando!");
    }

}
