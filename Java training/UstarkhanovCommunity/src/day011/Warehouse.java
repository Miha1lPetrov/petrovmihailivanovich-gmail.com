package day011;

import org.w3c.dom.ls.LSOutput;

public class Warehouse {
    private int countOrder;
    private int balance;

    public void setCountOrder(int countOrder){
        this.countOrder = countOrder;
    }
    public int getCountOrder(){
        return countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Warehouse { \n" +
                "Balance: " + balance + "\n" +
                "ConterOrder: " + countOrder + "\n"+
                "}";
    }

}
