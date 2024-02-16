package day012.Task05;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String nameBand;
    private int year;
    private List<MusicArtist> artists;
    public MusicBand(String nameBand, int year, List<MusicArtist> artists){
        this.nameBand = nameBand;
        this.year = year;
        this.artists = artists;
    }
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameBand() {
        return nameBand;
    }

    public void setNameBand(String nameBand) {
        this.nameBand = nameBand;
    }

    public List<MusicArtist> getArtists() {
        return artists;
    }

    public void setArtists(List<MusicArtist> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "nameBand='" + nameBand + '\'' +
                ", year=" + year +
                ", nameArtist='" + artists + '\'' +
                '}';
    }
    public void addArtist(String name, int age){
        artists.add(new MusicArtist(name, age));
    }
    public void removeArtist(String name, int age){
        for (int i = 0; i < artists.size(); i++) {
            if (artists.get(i).getName().equals(name) && artists.get(i).getAge() == age){
                artists.remove(artists.get(i));
            }
        }
    }
    public static void transferMembers(MusicBand mb1, MusicBand mb2){
        mb2.artists.addAll(mb2.artists);//Можно было циклом
        //Циклом
//        for (MusicArtist artist : mb1.getArtists()){
//            mb2.artists.add(artist);
//        }

        mb1.artists.clear();
    }
}
