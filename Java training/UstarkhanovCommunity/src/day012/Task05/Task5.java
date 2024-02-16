package day012.Task05;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        MusicBand cvetic = new MusicBand("Цветики", 1996,
                new ArrayList<>(Arrays.asList(new MusicArtist("Vasya", 25), new MusicArtist("Petya", 30))));
        MusicBand semicvetic = new MusicBand("Семицветик", 1998,
                new ArrayList<>(Arrays.asList(new MusicArtist("Kolya", 44), new MusicArtist("Sanya", 18))));

        System.out.println(cvetic);
        System.out.println(semicvetic);
        System.out.println("-----------------");
        cvetic.addArtist("PashOk", 32);
        System.out.println(cvetic);
        System.out.println("----------------");
        cvetic.removeArtist("PashOk", 32);
        System.out.println(cvetic);
        System.out.println("---------------------");
        MusicBand.transferMembers(cvetic, semicvetic);
        System.out.println(cvetic);
        System.out.println(semicvetic);


    }
}
