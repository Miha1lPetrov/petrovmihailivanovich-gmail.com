package day007;

import java.util.Random;

public class Player {

    private int stamina; //Выносливость игрока
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    static int countPlayers;
    static int reservPlayers;

    public Player(){
        Random random = new Random();
        int randomValue = random.nextInt(11)+90;
        stamina = randomValue;
        if (countPlayers <= 5){
            countPlayers++;
        }else {
            reservPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        if (stamina > MIN_STAMINA){
            stamina--;
        }else {
            countPlayers--;
        }
    }
    public static void reserv(){
        if (countPlayers < 6){
            if (reservPlayers > 0){
                countPlayers++;
                reservPlayers--;
            }else {
                System.out.println("Не хватает игроков резерва для игры 3х3");
            }
        }
    }

    public static void info(){
        if (countPlayers==6){
            System.out.println("На поле нет свободных мест");
        } else if (countPlayers < 6) {
            System.out.printf("Команды неполные. На поле еще есть %d " +
                    "свободных мест \n" , 6-countPlayers);
        }
    }

}
