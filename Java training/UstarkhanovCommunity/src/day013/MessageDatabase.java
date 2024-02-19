package day013;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>(); //условная база данных где хранятся сообщения


    public static void sendMessages(User user1, User user2, String text){ //Реализовали добавление нового сообщения
        messages.add(new Message(user1, user2, text)); //в наш список messages, добавляем НОВОЕ сообщение и переддаем все что получили в качестве аргумента
    }

    public static List<Message> getMessage(){
        return messages;
    }
    public static void showDialog(User user1, User user2){
        for (int i = 0; i < messages.size(); i++) {
            if (messages.get(i).getSender().equals(user1) && messages.get(i).getReceiver().equals(user2)){
                System.out.println(messages.get(i).getSender().getUserName()+ " : " + messages.get(i).getText());

            } else if (messages.get(i).getSender().equals(user2) && messages.get(i).getReceiver().equals(user1)) {
                System.out.println(messages.get(i).getSender().getUserName() + " : " + messages.get(i).getText());
            }
        }
    }

}
