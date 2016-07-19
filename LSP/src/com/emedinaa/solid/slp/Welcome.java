package com.emedinaa.solid.slp;

import com.emedinaa.solid.slp.sample.LanguagePortuguese;
import com.emedinaa.solid.slp.sample.LanguageSpanish;
import com.emedinaa.solid.slp.sample.Person;

/**
 * Created by em on 18/07/16.
 */
public class Welcome {

    public void weltomeTo(Person person){

        //String message= ((LanguagePortuguese)person).getMessage();
        //System.out.println("message "+message);

        String nMessage= null;

        if(person instanceof LanguageSpanish){
            nMessage= ((LanguageSpanish)person).getMessageES();
        }else if(person instanceof LanguagePortuguese){
            nMessage= ((LanguagePortuguese)person).getMessagePT();
        }

        System.out.println("nMessage "+nMessage);

    }

}
