package mk.ukim.finki.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.mk.lab.model.Album;
import mk.ukim.finki.mk.lab.model.Artist;
import mk.ukim.finki.mk.lab.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artists;
    public static long nextArtistId = 0;

    public static List<Song> songs;
    public static long nextSongId = 0;

    public static List<Album> albums;

    @PostConstruct
    public void init() {
        artists = new ArrayList<>();
        artists.add(new Artist(nextArtistId++, "Tose", "Proeski", "Sonce vo tvoite rusi kosi"));
        artists.add(new Artist(nextArtistId++, "Vlatko", "Lozanovski", "Neka patam"));
        artists.add(new Artist(nextArtistId++, "Karolina", "Goceva", "Ajde da letame"));
        artists.add(new Artist(nextArtistId++, "Elena", "Risteska", "Ninanajna"));
        artists.add(new Artist(nextArtistId++, "Kaliopi", "Bukle", "Bato"));

        songs = new ArrayList<>();

        ArrayList<Artist> songArtis = new ArrayList<>();
        songArtis.add(artists.get(0)); // Tose Proeski

        ArrayList<Artist> songArtis1 = new ArrayList<>();
        songArtis1.add(artists.get(1)); // Vlatko Lozanovski

        ArrayList<Artist> songArtis2 = new ArrayList<>();
        songArtis2.add(artists.get(2)); // Karolina Goceva

        ArrayList<Artist> songArtis3 = new ArrayList<>();
        songArtis3.add(artists.get(3)); // Elena Risteska

        ArrayList<Artist> songArtis4 = new ArrayList<>();
        songArtis4.add(artists.get(4)); // Kaliopi Bukle

        albums = new ArrayList<>();
        albums.add(new Album("Sonce", "Pop", "2002")); // For "Sonce vo tvoite rusi kosi" by Tose Proeski
        albums.add(new Album("Patam", "Pop", "2010")); // For "Neka patam" by Vlatko Lozanovski
        albums.add(new Album("Letame", "Pop", "2008")); // For "Ajde da letame" by Karolina Goceva
        albums.add(new Album("Nina", "Pop", "2006")); // For "Ninanajna" by Elena Risteska
        albums.add(new Album("Bato", "Rock", "1999")); // For "Bato" by Kaliopi Bukle

        songs.add(new Song(String.valueOf(nextSongId++), "Sonce vo tvoite rusi kosi", "Pop", 2002, songArtis, albums.get(0)));
        songs.add(new Song(String.valueOf(nextSongId++), "Neka patam", "Pop", 2010, songArtis1, albums.get(1)));
        songs.add(new Song(String.valueOf(nextSongId++), "Ajde da letame", "Pop", 2008, songArtis2, albums.get(2)));
        songs.add(new Song(String.valueOf(nextSongId++), "Ninanajna", "Pop", 2006, songArtis3, albums.get(3)));
        songs.add(new Song(String.valueOf(nextSongId++), "Bato", "Rock", 1999, songArtis4, albums.get(4)));
    }
}
