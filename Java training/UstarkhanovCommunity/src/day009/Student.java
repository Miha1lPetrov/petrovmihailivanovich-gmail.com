package day009;

public class Student extends Human{

    private String titleGroup;

    public Student(String titleGroup, String name){
        super(name);
        this.titleGroup = titleGroup;
    }

    public String getTitleGroup(){
        return this.titleGroup;
    }
    public void setTitleGroup(String titleGroup){
        this.titleGroup = titleGroup;
    }

//    public void printInfo(){
//        super.printInfo();
//        System.out.println("Это студент с именем " + getName());//Либо можно было просто с приватного поля стедалть protected он же саб-класс
//    }
public void printInfo(){
    super.printInfo();
    System.out.println("Это студент с именем " + name);
}

}
