package ru.birdflu.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
  //  private ClassicalMusic classicalMusic;
//  private RockMusic rockMusic;
//@Autowired
//@Qualifier("classicalMusic")
  private Music music1;
  private Music music2;

//  private String name;
//  private int volume;

  // IoC
// @Autowired
//  public MusicPlayer(ClassicalMusic  classicalMusic, RockMusic rockMusic) {
//    this.classicalMusic = classicalMusic;
//    this.rockMusic = rockMusic;
//  }

  public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
    this.music1 = music1;
    this.music2 = music2;
  }


//  public MusicPlayer() { }

  public String playMusic() {
   return "Playing " + music1.getSong() + ", " + music2.getSong();
//    System.out.println("Playing " + classicalMusic.getSong());
//    System.out.println("Playing " + rockMusic.getSong());

  }

//  @Autowired
//  public void setMusic(Music music) {
//    this.music = music;
//  }

//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void setVolume(int volume) {
//    this.volume = volume;
//  }
//
//  public int getVolume() {
//    return volume;
//  }
}
