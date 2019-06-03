package com.vcs.lects.l16.spring;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.vcs.lects.l16.spring.*"})
@PropertySource({"classpath:carrent.properties"})
public class CtxConfig {



}
