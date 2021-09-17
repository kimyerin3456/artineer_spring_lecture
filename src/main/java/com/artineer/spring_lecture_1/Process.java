package com.artineer.spring_lecture_1;

import com.artineer.spring_lecture_1.component.Acomponent;
import com.artineer.spring_lecture_1.component.Bcomponent;
import com.artineer.spring_lecture_1.component.Ccomponent;
import com.artineer.spring_lecture_1.component.Dcomponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Process implements ApplicationRunner {
    @Autowired
    Acomponent acomponent;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        Dcomponent dcomponent = new Dcomponent();
        Ccomponent ccomponent = new Ccomponent();
    }
}
