package ua.spring.lessons;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.spring.lessons.genre.ClassicalMusic;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        /*Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer rockMusicPlayer = new MusicPlayer(music);
        rockMusicPlayer.playMusic();
        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer2 = new MusicPlayer(music2);
        classicalMusicPlayer2.playMusic();*/
        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);*/
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(musicPlayer.playMusic());
        /*musicPlayer.playMusic(MusicGenre.CLASSICAL);
        musicPlayer.playMusic(MusicGenre.ROCK);*/
        context.close();
    }
}
