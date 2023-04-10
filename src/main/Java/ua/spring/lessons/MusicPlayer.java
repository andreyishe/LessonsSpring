package ua.spring.lessons;

import org.springframework.beans.factory.annotation.Value;
import ua.spring.lessons.genre.ClassicalMusic;
import ua.spring.lessons.genre.JazzMusic;
import ua.spring.lessons.genre.RockMusic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${MusicPlayer.name}")
    private String name;
    @Value("${MusicPlayer.volume}")
    private int volume;
    private List<String> genrelist = new ArrayList<String>();
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    private  JazzMusic jazzMusic;
    private Music music1;
    private Music music2;
    private List<Music> musicList;

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public MusicPlayer (List<Music> musicList){
        this.musicList = musicList;
    }


    public String playMusic(){
        Random random = new Random();
        return "Playing: "+ musicList.get(random.nextInt(musicList.size())).getSong()+" with volume "+this.volume;
    }
}
