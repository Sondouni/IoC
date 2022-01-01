package com.koreaIt.spring.ioc;

public class LgTv extends Tv {

    public LgTv(Speaker speaker) {
        super(speaker);
        System.out.println("--------LG--------");
    }
}
