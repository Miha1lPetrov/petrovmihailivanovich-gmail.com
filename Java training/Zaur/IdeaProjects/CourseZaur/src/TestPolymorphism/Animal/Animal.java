package TestPolymorphism.Animal;

public class Animal {

    String showName(){//СТАТИЧНЫЙ МЕТОД
        return "some Animal";
    }

    void showInfoAboutAnimal(){
        System.out.println("Name of Animal: " +showName());
    }
    String name;
}
