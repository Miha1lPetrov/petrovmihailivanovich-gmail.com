package TestPolymorphism.Animal;

public class Mouse extends Animal{
    String showName(){ //СТАТИЧНЫЙ МЕТОД
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of Mouse: " + showName());
    }
    String nameMouse;
}
