package day013;

import java.util.Date;

public class Message {

    private User sender; //Поле типа User отправитель
    private User receiver;//Поле типа User получатель
    private String text;//Текст сообщения
    private Date date;//Дата отправки сообщения

    public Message(User sender, User receiver, String text){
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        this.date = new Date(); //Дата отправки сообещния
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{ \n" +
                "FROM: " + this.sender + "\n" +
                "TO: " + this.receiver + "\n" +
                "ON: " + this.date + "\n" +
                 this.text + "\n" +
                '}';
    }
}
