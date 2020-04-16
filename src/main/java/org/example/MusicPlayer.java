package org.example;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@NoArgsConstructor
@Component
public class MusicPlayer {
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicGenre genre) {
        Random random = new Random();

        int randomNumb = random.nextInt(3);

        if (genre == MusicGenre.CLASSICAL){
            return music2.getSong().get(randomNumb);
        }
        else {
            return music1.getSong().get(randomNumb);
        }
    }
}
