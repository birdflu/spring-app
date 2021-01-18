package ru.birdflu.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.Date;
import java.util.List;
import java.util.Random;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {
  private List<String> songs = List.of("classicalSong1", "classicalSong2", "classicalSong3");
//  private ClassicalMusic() { }

  //@PostConstruct
  public void doMyInit() {
    System.out.println("Doing my initialization");
  }
  //@PreDestroy
  public void doMyDestroy() {
    System.out.println("Doing my distraction");
  }

  @Override
  public String getSong() {
    //return "Hungarian Rhapsody";
    return songs.get((new Random(new Date().getTime())).nextInt(3));
  }
}
