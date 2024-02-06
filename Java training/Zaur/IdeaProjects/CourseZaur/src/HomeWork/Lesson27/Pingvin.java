package HomeWork.Lesson27;

public class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
    }

    void eat(){
        System.out.println("Пингвин любит есть рыбу");
    }

    void sleep(){
        System.out.println("Пингвины спят прижавшись друг к другу");
    }

//    @Override
//    public void speak() {
//        System.out.println("пингвины не поют как соловьи");
//    }

    void fly(){
        System.out.println("Пини не умеют летать");
    }

}
