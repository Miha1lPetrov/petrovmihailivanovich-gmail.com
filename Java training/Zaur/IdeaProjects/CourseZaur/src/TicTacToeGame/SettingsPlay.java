package TicTacToeGame;

import java.util.Scanner;

public class SettingsPlay {
    public static void choosSide(Players p1, Players p2){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Игрок %s выбери команду прописав X или О иначе stop если хочешь выйти \n", p1.getName());
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("x")){
                p1.setSide("X");
                System.out.printf("Игроку %s досталась команда X \n", p1.getName());
                System.out.printf("Игроку %s досталась команда О \n", p2.getName());
                p2.setSide("O");
                break;
            } else if (s.equalsIgnoreCase("o")) {
                p1.setSide("O");
                System.out.printf("Игроку %s досталась команда O \n", p1.getName());
                System.out.printf("Игроку %s досталась команда X \n", p2.getName());
                p2.setSide("X");
                break;
            } else if (s.equalsIgnoreCase("stop")) {
                break;
            }else {
                System.out.println("Не верные команды");
            }
        }
    }



    public static void setNamePlayers(Players p1, Players p2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Вводит имя первый игрок");
        p1.setName(sc.nextLine());
        System.out.println("Вводите имя второй игрок");
        p2.setName(sc.nextLine());
    }
    public static void play(){
        System.out.println("Играем!");
        Players p1 = new Players();
        Players p2 = new Players();
        setNamePlayers(p1, p2);
        choosSide(p1, p2);
        PlayingField.infoField();

        while (true){
            PlayingField.drawGame();
            if (PlayingField.win == true){
                System.out.println("НИЧЬЯ");
                break;
            }
            PlayingField.step(p1);
            PlayingField.compareWin(p1);
            PlayingField.infoField();
            if (PlayingField.win == true){
                break;
            }
            PlayingField.drawGame();
            if (PlayingField.win == true){
                System.out.println("НИЧЬЯ");
                break;
            }
            PlayingField.step(p2);
            PlayingField.compareWin(p2);
            PlayingField.infoField();
            if (PlayingField.win == true){
                break;
            }

        }

    }

}
