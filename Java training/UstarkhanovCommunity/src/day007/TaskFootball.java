package day007;

import java.util.Random;

public class TaskFootball {
    public static void main(String[] args) {
        Player a1 = new Player();
        Player a2 = new Player();
        Player a3 = new Player();
        Player a4 = new Player();
        Player a5 = new Player();
        Player a6 = new Player();
        Player a7 = new Player();

        Player.info();
        System.out.println(Player.countPlayers);
        System.out.println(Player.reservPlayers);
        System.out.println();

        for (int i = a1.getStamina()+1; i > 0; i--) {
            a1.run();
        }

        Player.info();
        System.out.println(Player.countPlayers);
        System.out.println(Player.reservPlayers);
        System.out.println();


    }
}
