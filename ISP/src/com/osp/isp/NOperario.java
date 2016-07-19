package com.osp.isp;

/**
 * Created by em on 21/06/16.
 */
public class NOperario implements INTrabajador,INEquivocador {
    @Override
    public void equivocarse() {
        System.out.println("NOperario equivocarse ");
    }

    @Override
    public void trabaja() {
        System.out.println("NOperario trabaja ");
    }
}
