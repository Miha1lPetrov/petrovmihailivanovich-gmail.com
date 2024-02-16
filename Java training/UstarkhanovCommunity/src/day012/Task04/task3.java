package day012.Task04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task3 {

    public static List<MusicBand> groupsAfter2000(List<MusicBand> mb){
        List<MusicBand> after2000 = new ArrayList<>();
        for (int i = 0; i < mb.size(); i++) {
            if (mb.get(i).getYear() < 2000){
                after2000.add(mb.get(i));
            }
        }
        return after2000;
    }
    public static void main(String[] args) {

        List<MusicBand> groups = new ArrayList<>(){{
            add(new MusicBand("Цветики", 1990, new ArrayList<>(Arrays.asList("Vasya", "Petya"))));
            add(new MusicBand("Семицветики", 1993, new ArrayList<>(Arrays.asList("Kolya", "Sanya"))));
            add(new MusicBand("Зайчики", 1995, new ArrayList<>()));
        }};

        MusicBand cvetiki = groups.getFirst();
        MusicBand semicvetiki = groups.get(1);
        MusicBand zaichiki = groups.get(2);
        System.out.println(cvetiki);
        System.out.println(semicvetiki);
        cvetiki.addArtist("Biba");
        System.out.println(cvetiki);
        cvetiki.removeArtist("Biba");
        System.out.println(cvetiki);
        System.out.println("--------------------");
        MusicBand.transferMembers(cvetiki, semicvetiki);
        System.out.println(semicvetiki);
        System.out.println(cvetiki);
        semicvetiki.printListArtistBand();



    }

}
