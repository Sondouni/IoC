package com.koreaIt.spring.basic;

public class Tv {
    private Speaker speaker;

    public Tv(Speaker speaker){
        this.speaker = speaker;
    }
    public void volumeUp(){
        speaker.speakUp();
        printCurrentVolume();
    }

    public void volumeDown(){
        speaker.speakDown();
        printCurrentVolume();
    }
    public void printCurrentVolume(){
        System.out.println("소리크기 : " + speaker.getVolume());

    }
}
