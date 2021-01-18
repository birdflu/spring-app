package ru.birdflu.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
  public static void main(String[] args) {
//    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//            "applicationContext.xml");

//    Music music1 = context.getBean("musicBean", Music.class);
//    MusicPlayer musicPlayer = new MusicPlayer(music1);
//    musicPlayer.playMusic();
//
//    Music music2 = context.getBean("rockMusic", Music.class);
//    musicPlayer = new MusicPlayer(music2);
//    musicPlayer.playMusic();



//    Computer computer = context.getBean("computer", Computer .class);
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            SpringConfig.class);

    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer .class);
    System.out.println(musicPlayer.getName());
    System.out.println(musicPlayer.getVolume());
    System.out.println(musicPlayer.playMusic());

    context.close();

  }
}
