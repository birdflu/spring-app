package ru.birdflu.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MusicPlayer {
  @Value("${musicPlayer.name}")
  private String name;

  @Value("${musicPlayer.volume}")
  private int volume;

  private Music music1;
  private Music music2;

  public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
    this.music1 = music1;
    this.music2 = music2;
  }

  public String playMusic(MusicType musicType) {
    if (musicType == MusicType.CLASSICAL)
      return "Playing " + music2.getSong();
    else
      return "Playing " + music1.getSong();
  }

  public String getName() {
    return name;
  }

  public int getVolume() {
    return volume;
  }
}
