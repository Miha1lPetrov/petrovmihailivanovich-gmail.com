package TicTacToeGame;

import java.util.Scanner;

public class PlayingField {

    public static String[][] FIELD = {{"1","2","3"}, {"4","5","6"}, {"7","8","9"}};

    public static boolean win = false;
    public static void infoField(){
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD.length; j++) {
                System.out.print(FIELD[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void step(Players p){
        Scanner sc = new Scanner(System.in);
        System.out.printf("игрок %s ходит \n", p.getName());
        while (sc.hasNextInt()){
            int step = sc.nextInt();
            if (step >= 1 && step <=9){
                if (step <= 3){
                    if (FIELD[0][step-1].equalsIgnoreCase("X") || FIELD[0][step-1].equalsIgnoreCase("O")){
                        System.out.println("Ячейка занята");
                        continue;
                    }else {
                        FIELD[0][step-1] = p.getSide();
                        break;
                    }
                } else if (step <= 6) {
                    if (FIELD[1][step-4].equalsIgnoreCase("X") || FIELD[1][step-4].equalsIgnoreCase("O")){
                        System.out.println("Ячейка занята");
                        continue;
                    }else {
                        FIELD[1][step-4] = p.getSide();
                        break;
                    }
                } else {
                    if (FIELD[2][step-7].equalsIgnoreCase("X") || FIELD[2][step-7].equalsIgnoreCase("O")){
                        System.out.println("Ячейка занята");
                        continue;
                    }else {
                        FIELD[2][step-7] = p.getSide();
                        break;
                    }
                }
            }else {
                System.out.println("Не верные данные");
            }
        }
    }

    public static void compareWinLine(Players p) {
        int countX = 0;
        int countO = 0;
        for (String[] s : FIELD) {
            for (String s1 : s) {
                if (s1.equalsIgnoreCase("x")) {
                    countX++;
                } else if (s1.equalsIgnoreCase("o")) {
                    countO++;
                }
            }
            if (countX == 3 || countO == 3){
                System.out.println("win " + p.getName());
                win = true;
            }
            countX=0;
            countO=0;
        }

    }
    public static void compareWinDiagonal(Players p){
        if ((FIELD[0][0] == "X" && FIELD[1][1] == "X" && FIELD[2][2] == "X") || (FIELD[0][0] == "O" && FIELD[1][1] == "O" && FIELD[2][2] == "O")){
            System.out.println("win " + p.getName());
            win = true;
        } else if ((FIELD[0][2] == "X" && FIELD[1][1] == "X" && FIELD[2][0] == "X") || (FIELD[0][2] == "O" && FIELD[1][1] == "O" && FIELD[2][0] == "O")) {
            System.out.println("win " + p.getName());
            win = true;
        }
    }

    public static void compareWinTable(Players p){
        if ((FIELD[0][0] == "X" && FIELD[1][0] == "X" && FIELD[2][0] == "X") ||
                (FIELD[0][0] == "O" && FIELD[1][0] == "O" && FIELD[2][0] == "O") ||
                (FIELD[0][1] == "X" && FIELD[1][1] == "X" && FIELD[2][1] == "X") ||
                (FIELD[0][1] == "O" && FIELD[1][1] == "O" && FIELD[2][1] == "O") ||
                (FIELD[0][2] == "X" && FIELD[1][2] == "X" && FIELD[2][2] == "X") ||
                (FIELD[0][2] == "O" && FIELD[1][2] == "O" && FIELD[2][2] == "O")){
            System.out.println("win " + p.getName());
            win = true;
        }
    }

    public static void drawGame(){
        int count = 0;
        for (String [] s : FIELD){
            for (String s1 : s){
                if (s1.equalsIgnoreCase("x") || s1.equalsIgnoreCase("o")) {
                    count++;
                }
            }
        }
        if (count == 9){
            win = true;
        }else {
            count = 0;
        }

    }
    public static void compareWin(Players p){
        compareWinLine(p);
        compareWinDiagonal(p);
        compareWinTable(p);
    }





}
