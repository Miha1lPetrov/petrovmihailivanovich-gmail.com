package HomeWork.Lesson27;

abstract class Animal {
    public String name;
    Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void eat(); //Абстрактые методы абстрактного класса (обязаны перезаписать или сабкласс должен быть абстракт)
    abstract void sleep();//Абстрактые методы абстрактного класса (обязаны перезаписать или сабкласс должен быть абстракт)

}
