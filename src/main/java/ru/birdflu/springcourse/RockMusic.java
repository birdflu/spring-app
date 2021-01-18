package ru.birdflu.springcourse;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
  private List<String> songs = List.of("rockSong1", "rockSong2", "rockSong3");
  @Override
  public String getSong() {
    return songs.get((new Random(new Date().getTime())).nextInt(3));
    //return "Wind cries Mary";
  }


}
