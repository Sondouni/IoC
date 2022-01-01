package com.koreaIt.spring.basic;

public class TvTest {
    public static void main(String[] args) {
        /*
            소스의 수정없이
            Main 메소드의 파라미터인 args를 사용하여 tv변수에 담기는 객체를 변경할수 있다.
         */
        System.out.println("args.length : "+args.length);
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        Factory factory = new Factory();
        String speakerCompany  = args[0];
        String tvCompany = args[1];

        Speaker speaker = factory.getSpeaker(speakerCompany);
        Tv tv = factory.getTv(tvCompany,speaker);
    }
}
