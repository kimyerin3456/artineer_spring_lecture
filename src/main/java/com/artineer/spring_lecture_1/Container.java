package com.artineer.spring_lecture_1;

import com.artineer.spring_lecture_1.component.Acomponent;
import com.artineer.spring_lecture_1.component.Bcomponent;
import com.artineer.spring_lecture_1.component.Ccomponent;
import com.artineer.spring_lecture_1.component.Dcomponent;

public class Container {
    private static final Container singleton = new Container();

    private Acomponent acomponent;
    private Bcomponent bcomponent;
    private Ccomponent ccomponent;
    private Dcomponent dcomponent;

    private Container(){ }

    public static Container getInstance() {
        return singleton;
    }

    public synchronized Acomponent getAcomponent(){
        if(bcomponent==null){
            bcomponent = new Bcomponent();
        }
        if (ccomponent == null) {
            ccomponent = new Ccomponent();
        }
        if (dcomponent == null){
            dcomponent = new Dcomponent();
        }
        if (acomponent == null) {
            acomponent = new Acomponent(bcomponent, ccomponent, dcomponent);
        }
        return acomponent;
    }

}
