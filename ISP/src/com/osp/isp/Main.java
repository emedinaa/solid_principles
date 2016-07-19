package com.osp.isp;

/**
 * Created by em on 21/06/16.
 */
public class Main {

    //https://www.jetbrains.com/help/idea/2016.1/generating-main-method-example-of-applying-a-simple-live-template.html
    public static void main(String[] args) {

        ITrabajador operario= new Operario();
        operario.trabaja();
        operario.equivocarse();

        ITrabajador encargado = new Encargado();
        encargado.trabaja();
        encargado.equivocarse();


        ITrabajador automata = new Automata();
        automata.trabaja();
        automata.equivocarse();

        //--------------------------

        INTrabajador nAutomata = new NAutomata();
        nAutomata.trabaja();

        NOperario nOperario = new NOperario();
        nOperario.trabaja();
        nOperario.equivocarse();

    }
}
