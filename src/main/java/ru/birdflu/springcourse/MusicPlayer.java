package ru.birdflu.springcourse;

import org.springframework.beans.factory.annotation.Value;

import java.util.Date;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
  @Value("${musicPlayer.name}")
  private String name;

  @Value("${musicPlayer.volume}")
  private int volume;

  private List<Music> musicList;

  // public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {


  public MusicPlayer(List<Music> musicList) {
    this.musicList = musicList;
  }

  public String playMusic() {
    return musicList.get((new Random(new Date().getTime())).nextInt(3)).getSong();
  }

  public String getName() {
    return name;
  }

  public int getVolume() {
    return volume;
  }
}
