package day005;

public class Task1 {
    public static void main(String[] args) {
        Car c1 = new Car(); //Создали пустой объект класса Car и только ниже инициализируем (а если не все поля инициализируем?)
        //System.out.println(c1.getColor() + " " + c1.getYearOfReleas());//Тут выводились бы дефолтные значения
        c1.setYearOfReleas(2007); //инициализируем поля объекта класса Car через публичные методы
        c1.setColor("Вишневый");
        c1.setModel("ВАЗ 2109");

        System.out.printf("Model: " + c1.getModel() + " \n" +
                "Color: " + c1.getColor() + " \n" +
                "year: " + c1.getYearOfReleas() + "\n\n");

        //Car можно было создать ПУСТОЙ объект, а в конструкторе мы обязуем пользователя создать объект с определенными параметрами
        Motorbike m1 = new Motorbike(2010, "Белый", "Ямаха");//Без инициализации наш объект бы не создался
        System.out.printf("Model: " + m1.getModel() + " \n" +
                "Color: " + m1.getColor() + " \n" +
                "year: " + m1.getYearOfReleas());

    }



}
