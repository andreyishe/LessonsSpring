package ua.spring.lessons;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classicalMusic = context.getBean("musicBean1", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        /*Music music = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        firstMusicPlayer.setVolume(30);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        System.out.println(comparison);

        System.out.println(secondMusicPlayer);


        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        firstMusicPlayer.playMusic();*/

        context.close();
    }
}
