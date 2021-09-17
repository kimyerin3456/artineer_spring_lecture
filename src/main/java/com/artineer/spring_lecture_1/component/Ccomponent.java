package com.artineer.spring_lecture_1.component;

import org.springframework.stereotype.Component;

@Component
public class Ccomponent {
    Dcomponent dcomponent;
    public Ccomponent(Dcomponent dcomponent){
        this.dcomponent=dcomponent;
    }
}
