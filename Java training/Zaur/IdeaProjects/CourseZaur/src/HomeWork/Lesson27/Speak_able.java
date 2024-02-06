package HomeWork.Lesson27;

public interface Speak_able {
    default void speak(){ //ДЕФОЛТНЫЕ МЕТОДЫ В interface ПЕРЕЗАПИСЫВАЕМ ТОЛЬКО В ТЕХ КЛАССАХ В КОТОРЫХ ОН НУЖЕН
        System.out.println("Somebody speaks");
    }
    void method2();//Абстрактный метод интерфейса ОБЯЗАНЫ ПЕРЕЗАПИсАТЬ ВСЕ КЛАССЫ КОТОРЫЕ имплементят интерфейс и обязательно public у перезаписанных методв
    static void method(){//К статик методам в interface можем обращаться ТОЛЬКО ПО ИМЕННИ interface
        System.out.println("static method interface");//статик методы не наследуются классом который имплементит интерфейс
    }

}
