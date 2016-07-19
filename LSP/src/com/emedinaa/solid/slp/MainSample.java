package com.emedinaa.solid.slp;

import com.emedinaa.solid.slp.sample.LanguageEnglish;
import com.emedinaa.solid.slp.sample.LanguageSpanish;
import com.emedinaa.solid.slp.sample.Person;

/**
 * Created by em on 19/07/16.
 */
public class MainSample {

    public static void main(String[] args) {
        final Person personES = new LanguageSpanish();
        final Person personEN = new LanguageEnglish();

        Welcome welcome= new Welcome();
        welcome.weltomeTo(personES);
        //welcome.weltomeTo(personEN);
    }
}
