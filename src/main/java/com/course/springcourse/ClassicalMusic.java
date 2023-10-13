package com.course.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {


    private String[] music = {"Classical Music first", "Classical Music second", "Classical Music third"};
    @Override
    public String getSong() {
        return music[(int) (Math.random()*3)];
    }
}
