package com.koreaIt.spring.ioc;

public class SamsungTv extends Tv {

    public SamsungTv(Speaker speaker) {
        super(speaker);
        System.out.println("--------Samsung--------");

    }
}
