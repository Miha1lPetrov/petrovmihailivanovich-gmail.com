package HomeWork.Lesson9;

public class WorkObject {
    //нужно создать 8 объектов, но к концу метода main чтобы осталось всего 2 рабочих
    static void workObject(){
        WorkObject wo1 = new WorkObject();
        WorkObject wo2 = new WorkObject();
        //работают данные объекты только внутри метода тк объекты являются локальными и когда метода заканчивается, объекты по сути должны быть удалены
    }
    public static void main(String[] args) {
        WorkObject wo3 = new WorkObject();//рабочий
        workObject();//метод отработал и объекты прекращают свое существование тк они существуют только внутри метода workObject
        workObject();
        String s1 = new String();//рабочий о конца метода main
        workObject();
    }
}


