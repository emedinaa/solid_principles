package com.emedinaa.solid.slp;

/**
 * Created by em on 18/07/16.
 */
public class Main {

    public static void main(String[] args) {
        final Person personES = new LanguageSpanish();
        final Person personEN = new LanguageEnglish();

        Welcome welcome= new Welcome();
        welcome.weltomeTo(personES);
        //welcome.weltomeTo(personEN);

    }
}
