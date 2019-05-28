package com.vcs.lects.l11.client;

import com.vcs.lects.l04.operators.tasks.SavDienos;

public class MySuperSav extends SavDienos {

    @Override
    public String weekDayToStr(int i) {

        // Fixed
//        if (i == 2) {
//            return "Antradienis";
//
//        }

        return super.weekDayToStr(i);
    }

}
