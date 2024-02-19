package day013;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private String userName;
    private List<User> subscriptions; //подпики пользователя
    public User(String userName){
        this.userName = userName;
        this.subscriptions = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void subscribe(User user){
        if (this.isSubscribed(user)){
            System.out.println("Вы уже подписаны на данного пользователя");
        }else {
            this.subscriptions.add(user);
        }
    }

    public boolean isSubscribed(User user){ //Подписан ли один пользователь на другого
        if (this.subscriptions == null){
            return false;
        }else if (this.subscriptions.contains(user)){
            return true;
        }else {
            return false;
        }
    }

    public boolean isFriend(User user){ //если оба подписаны друг на друга то они друзья
//        if (this.isSubscribed(user) && user.isSubscribed(this)){
//            return true;
//        }else {
//            return false;
//        }
        //Можно было сразу через returne
        return this.isSubscribed(user) && user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessages(this, user, text);
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName  +
                '}';
    }
}
