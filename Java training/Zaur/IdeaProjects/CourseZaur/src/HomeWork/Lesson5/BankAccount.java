package HomeWork.Lesson5;

public class BankAccount {

    int id;
    double balance;
    String name;

    void popolnenie(double num){
        System.out.println(balance + " bilo ");
        balance+=num;
        System.out.println(balance + " stalo");
    }

}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        BankAccount ba2 = new BankAccount();
        ba.id = 1;
        ba.name = " Dodya";
        ba.balance = 100;

        ba2.id = 2;
        ba2.name = "Zina";
        ba2.balance = 550;

        ba.popolnenie(100.2);
        System.out.println(ba.balance);

        System.out.println(ba2.balance);
        ba2.popolnenie(50);
        System.out.println(ba2.balance);

    }
}
