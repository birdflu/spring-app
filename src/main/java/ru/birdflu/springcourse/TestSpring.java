package ru.birdflu.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "applicationContext.xml");

//    Music music1 = context.getBean("musicBean", Music.class);
//    MusicPlayer musicPlayer = new MusicPlayer(music1);
//    musicPlayer.playMusic();
//
//    Music music2 = context.getBean("rockMusic", Music.class);
//    musicPlayer = new MusicPlayer(music2);
//    musicPlayer.playMusic();

    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
    musicPlayer.playMusic();

    context.close();

  }
}
