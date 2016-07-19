package com.osp.isp;

/**
 * Created by em on 21/06/16.
 */
public class Automata implements ITrabajador {
    @Override
    public void trabaja() {
        System.out.println("Automata trabaja");
    }

    /**
     * Implementar un método que no va utilizar
     */
    @Override
    public void equivocarse() {
        System.out.println("Automata no se equivoca ????? ");
    }
}
