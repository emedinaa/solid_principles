package com.emedinaa.solid.ocp;

import com.emedinaa.solid.ocp.carton.Cartoon;

/**
 * Created by em on 18/07/16.
 */
public class NSimpsonsDrawer {

    public void draw(Cartoon[] simpsons){
        for(Cartoon cartoon: simpsons){
            cartoon.draw();
        }
    }
}
