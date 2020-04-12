package org.example;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class MusicPlayer {
    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music){
        this.music = music;
    }
    public void playMusic() {
        System.out.println("Playing... " + music.getSoung());
    }
}
