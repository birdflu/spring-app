package ru.birdflu.springcourse;

import java.util.Date;
import java.util.List;
import java.util.Random;

public class JazzMusic implements Music {
  private List<String> songs = List.of("jazzSong1", "jazzSong2", "jazzSong3");
  @Override
  public String getSong() {
    return songs.get((new Random(new Date().getTime())).nextInt(3));
  }

}