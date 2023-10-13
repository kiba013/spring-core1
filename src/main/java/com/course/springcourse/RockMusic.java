package com.course.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RockMusic implements Music {
    private String[] musics = {"Rock Music first", "Rock Music second", "Rock Music third"};
    @Override
    public String getSong() {
        return musics[(int) (Math.random()*2)];
    }
}
