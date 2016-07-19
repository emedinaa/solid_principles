package com.osp.isp;

/**
 * Created by em on 21/06/16.
     sout - just print System.out.println()

     soutm - added Class name & method name

     soutp - added parameter

     soutv - added last variable name
 */
public class Operario implements ITrabajador {
    @Override
    public void trabaja() {
        System.out.println("Operario trabaja");
    }

    @Override
    public void equivocarse() {
        System.out.println("Operario equivocarse");
    }
}
