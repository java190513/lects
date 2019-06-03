package com.vcs.lects.l16.spring.auto;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Trabant implements Car{

    @Override
    public void uzvesti() {
        System.out.println("puff.. puf.. br... brum brumm");
    }
}
