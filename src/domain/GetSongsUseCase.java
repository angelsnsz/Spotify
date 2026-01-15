package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetSongsUseCase {


    public ArrayList<Song> execute(){
        Song song1= new Song();
        song1.setId("1");
        song1.setTitle("Macarena");
        song1.setAuthor("Los del Rio");
        song1.setDuration("4:00:00");

        Song song2= new Song();
        song2.setId("2");
        song2.setTitle("Pollito Pepe");
        song2.setAuthor("Las Ketchup");
        song2.setDuration("3:00:00");

        ArrayList<Song> songs= new ArrayList<>();
        songs.add(song1);
        songs.add(song2);

        return songs;
    }
}
