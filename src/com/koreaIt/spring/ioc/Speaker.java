package com.koreaIt.spring.ioc;

public class Speaker {
    private int volume;
    private final int MAX_VOLUME;

    public Speaker(int MAX_VOLUME,String name){
        System.out.println("-----ㄴㅁㅇㅇ-----");
        System.out.println("----"+name+"----");
        this.MAX_VOLUME = MAX_VOLUME;
    }
    public void speakUp(){
        if(volume<MAX_VOLUME){
            volume++;
        }
    }

    public void speakDown(){
        if(volume>0){
            volume--;
        }
    }
    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
}
