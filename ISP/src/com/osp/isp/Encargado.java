package com.osp.isp;

/**
 * Created by em on 21/06/16.
 */
public class Encargado implements ITrabajador {

    @Override
    public void trabaja() {
        System.out.println("Encargado trabaja");
    }

    @Override
    public void equivocarse() {
        System.out.println("Encargado equivocarse");
    }
}
