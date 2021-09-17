package com.artineer.spring_lecture_1.component;

import org.springframework.stereotype.Component;

@Component
public class Dcomponent {
    Ccomponent ccomponent;

    public Dcomponent(Ccomponent ccomponent){
        this.ccomponent=ccomponent;
    }
}
