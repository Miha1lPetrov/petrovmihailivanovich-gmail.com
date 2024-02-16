package day012.Task03;

import java.util.ArrayList;
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
            add(new MusicBand("2Pac", 1990));
            add(new MusicBand("Snoop Dogg", 1993));
            add(new MusicBand("Ice Cube", 1990));
            add(new MusicBand("Lil Wayne", 2002));
            add(new MusicBand("Jay-Z", 1990));
            add(new MusicBand("Nas", 1994));
            add(new MusicBand("The Notorious B.I.G.", 1993));
            add(new MusicBand("Future", 2007));
            add(new MusicBand("50 Cent", 1996));
            add(new MusicBand("Kanye West", 2005));
        }};

        for (MusicBand mb : groups){
            System.out.println(mb.getName() + " " + mb.getYear());
        }
        System.out.println("--------------------");

        Collections.shuffle(groups);

        for (MusicBand mb : groups){
            System.out.println(mb.getName() + " " + mb.getYear());
        }
        System.out.println("------------------------");

        List<MusicBand> after2000 = groupsAfter2000(groups);
        for (MusicBand mb : after2000){
            System.out.println(mb.getName() + " " + mb.getYear());
        }

    }

}
