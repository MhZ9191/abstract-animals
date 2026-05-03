package org.lessons.abstact;
import org.lessons.interfaces.*;

public class Main {
    public static void main(String[] args) {
    
    Cane fufi = new Cane("fufi");
    System.out.println(fufi.mangia());

    Passerotto cip = new Passerotto("cip");
    System.out.println(cip.mangia());

    Aquila gino = new Aquila("gino");
    System.out.println(gino.mangia());
    gino.dormi();

    Delfino willy = new Delfino("willy");
    System.out.println(willy.mangia());
    willy.dormi();

    faiNuotare(willy);
    faiVolare(gino);
    faiVolare(cip);
}

public static void faiVolare(Vola animale){
    animale.vola();
}

public static void faiNuotare(Nuota animale){
    animale.nuota();
}

}
