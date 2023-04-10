package ua.spring.lessons;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ua.spring.lessons.genre.ClassicalMusic;
import ua.spring.lessons.genre.JazzMusic;
import ua.spring.lessons.genre.RockMusic;

import java.util.Arrays;
import java.util.List;

@PropertySource("classpath:MusicPlayer.properties")
@Configuration
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public JazzMusic jazzMusic(){
        return new JazzMusic();
    }
    @Bean
    public List<Music> musicList(){
        return Arrays.asList(classicalMusic(), rockMusic(), jazzMusic());
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(musicList());
    }



}
