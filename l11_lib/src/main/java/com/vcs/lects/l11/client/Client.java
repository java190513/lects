package com.vcs.lects.l11.client;

import com.vcs.lects.l04.operators.tasks.SavDienos;
import org.apache.commons.lang3.StringUtils;

public class Client {


    public static void main(String[] args) {

        SavDienos sd = new MySuperSav();
        System.out.println( sd.weekDayToStr(6) );

    }
}
