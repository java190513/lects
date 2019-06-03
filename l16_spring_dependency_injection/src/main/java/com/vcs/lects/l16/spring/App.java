package com.vcs.lects.l16.spring;

import com.vcs.lects.l16.spring.auto.Street;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {


    public static void main(String[] args) {


        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

        ctx.register(CtxConfig.class);

        ctx.refresh();

        ctx.close();




    }

}
