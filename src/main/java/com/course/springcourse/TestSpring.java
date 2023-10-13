package com.course.springcourse;

import com.course.springcourse.book.Book;
import com.course.springcourse.book.ReadingBook;
import com.course.springcourse.drive.Car;
import com.course.springcourse.drive.DrivingCar;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music, music);

        musicPlayer.playMusic();
    }
}
