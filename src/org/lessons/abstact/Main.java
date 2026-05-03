package org.lessons.abstact;

public class Main {
    public static void main(String[] args) {
    
    Cane fufi = new Cane("fufi");
    System.out.println(fufi.mangia());

    Passerotto cip = new Passerotto("cip");
    System.out.println(cip.mangia());

    Aquila gino = new Aquila("gino");
    System.out.println(gino.mangia());
    gino.dormi();

    Animale willy = new Delfino("willy");
    System.out.println(willy.mangia());
    willy.dormi();
}
}
