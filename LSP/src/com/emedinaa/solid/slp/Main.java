package com.emedinaa.solid.slp;

import com.emedinaa.solid.slp.sample.*;

/**
 * Created by em on 18/07/16.
 */
public class Main {

    public static void main(String[] args) {
        final LanguageSpanish personES = new LanguageSpanish();
        final LanguagePortuguese personPT = new LanguagePortuguese();
        final LanguageEnglish personEN = new LanguageEnglish();

        Welcome welcome= new Welcome();
        welcome.weltomeTo(personEN);

    }
}
