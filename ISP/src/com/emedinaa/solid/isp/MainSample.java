package com.emedinaa.solid.isp;

import com.emedinaa.solid.isp.sample.NAutomata;
import com.emedinaa.solid.isp.sample.NEncargado;
import com.emedinaa.solid.isp.sample.NOperario;
import com.emedinaa.solid.isp.sample.NTrabajador;

/**
 * Created by emedinaa on 18/07/16.
 */
public class MainSample {

    public static void main(String[] args) {
        NEncargado nEncargado= new NEncargado();
        NOperario nOperario= new NOperario();
        NAutomata nAutomata= new NAutomata();

        nEncargado.trabaja();
        nEncargado.incurre();

        nOperario.trabaja();
        nOperario.incurre();

        nAutomata.trabaja();
    }
}
