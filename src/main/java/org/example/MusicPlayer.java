package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    // IoC
    public MusicPlayer(List<Music> music) {
        this.musicList = music;
    }

    public void playMusic() {
        for(Music m : musicList) {
            System.out.println("Playing... " + m.getSoung());
        }
    }
}
