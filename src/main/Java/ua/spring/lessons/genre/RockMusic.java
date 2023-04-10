package ua.spring.lessons.genre;

import org.springframework.stereotype.Component;
import ua.spring.lessons.Music;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock";
        }
    }
