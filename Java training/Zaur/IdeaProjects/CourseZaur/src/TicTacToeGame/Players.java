package TicTacToeGame;

import java.util.Scanner;

public class Players {

    private String name;
    private String side;

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
}
