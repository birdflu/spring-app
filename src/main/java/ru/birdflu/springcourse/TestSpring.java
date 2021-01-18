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



//    Computer computer = context.getBean("computer", Computer .class);
    MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer .class);
    System.out.println(musicPlayer.getName());
    System.out.println(musicPlayer.getVolume());

    ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic .class);
    ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic .class);

    System.out.println(classicalMusic1 == classicalMusic2);

    context.close();

  }
}
