package ua.spring.lessons.genre;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.spring.lessons.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classical";
    }
}
