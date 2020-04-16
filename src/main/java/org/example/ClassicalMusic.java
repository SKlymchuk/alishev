package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songs = new ArrayList<>();

    {
        songs.add("Mocarella");
        songs.add("Bah");
        songs.add("Chayka");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
