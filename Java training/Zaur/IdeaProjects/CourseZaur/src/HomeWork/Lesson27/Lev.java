package HomeWork.Lesson27;

public class Lev extends Mammal{

    Lev(String name){
        super(name);
    }

    void eat(){
        System.out.println("Лев как любой хищник любит мясо");
    }

    void sleep(){
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    void run() {
        System.out.println("Лев это не самая быстрая кошка");
    }
}
