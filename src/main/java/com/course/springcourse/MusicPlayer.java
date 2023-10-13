package com.course.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {


    private final Music music1;
    private final Music music2;

    // Inversion of Control(IoC)

    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public void playMusic() {
        System.out.println("Playing music: " + music1.getSong());
    }
}
