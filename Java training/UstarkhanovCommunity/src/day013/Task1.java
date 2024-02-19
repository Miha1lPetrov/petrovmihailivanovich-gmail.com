package day013;

public class Task1 {
    public static void main(String[] args) {

        User u1 = new User("Vasya");
        User u2 = new User("Kolya");
        User u3 = new User("Petya");

        u1.sendMessage(u2, "Првиет");
        u1.sendMessage(u2, "как дела");

        u2.sendMessage(u1, "Здарова");
        u2.sendMessage(u1, "Да нормик");
        u2.sendMessage(u1, "ты как?");

        u3.sendMessage(u1, "Салам");
        u3.sendMessage(u1, "че вечером делаешь?");
        u3.sendMessage(u1, "го бухать");

        u1.sendMessage(u3, "КУ");
        u1.sendMessage(u3, "ну хз хз");
        u1.sendMessage(u3, "а че где?");

        u3.sendMessage(u1, "У сани");

        MessageDatabase.showDialog(u1, u3);
        System.out.println("---------------------------");
        MessageDatabase.showDialog(u1, u2);

    }
}
