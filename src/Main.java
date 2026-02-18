import features.albums.presentation.AlbumView;
import features.author.presentation.AuthorView;
import features.songs.presentation.SongView;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SongView.printSongs();
        AuthorView.printAuthors();
        AlbumView.printAlbum();
    }
}