package com.emedinaa.solid.slp.sample;

import com.emedinaa.solid.slp.sample.Person;

/**
 * Created by em on 18/07/16.
 */
public class LanguageSpanish implements Person {
    @Override
    public void greet() {
        System.out.println("¡Hola!");
    }

    @Override
    public String getMessage() {
        return "¡Hola!";
    }

    public String getMessageES(){
        return "¡Hola!";
    }
}
