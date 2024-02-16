package day009;

public class Teacher extends Human{
    private String nameLesson;
    public Teacher(String nameLesson, String name){
        super(name);
        this.nameLesson = nameLesson;
    }

    public String getNameLesson() {
        return nameLesson;
    }

    public void setNameLesson(String nameLesson) {
        this.nameLesson = nameLesson;
    }

//    public void printInfo(){
//        super.printInfo();
//        System.out.println("Это преподаватель с именем " + getName());//Либо можно было просто с приватного поля стедалть protected он же саб-класс
//    }

    public void printInfo(){
        super.printInfo();
        System.out.println("Это преподаватель с именем " + name);
    }

}
