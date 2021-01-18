package ru.birdflu.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
  private Music music;
//  private String name;
//  private int volume;

  // IoC
  @Autowired
  public MusicPlayer(Music music) {
      this.music = music;
  }

//  public MusicPlayer() { }

  public void playMusic() {
    System.out.println("Playing " + music.getSong());

  }

//  public void setMusic(Music music) {
//    this.music = music;
//  }
//
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
