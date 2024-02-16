package day011;

public class Task1 {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        Picker p1 = new Picker(warehouse); //В конструкторе указываем ссылку на созданный объект класса Warehouse
        Courier c1 = new Courier(warehouse);//В конструкторе указываем ссылку на созданный объект класса Warehouse

        //System.out.println(warehouse + " " + p1 + " " + c1);//просто вывели данные о сотрудниках
        p1.doWork();
        c1.doWork();
        System.out.println(warehouse + " " + p1 + " " + c1);


        for (int i = 1; i <= 1500; i++) {
            p1.doWork();
            c1.doWork();
        }
        p1.bonus();
        c1.bonus();
        System.out.println(warehouse + " " + p1 + " " + c1);
////        p1.doWork();
////        c1.doWork();
//        p1.bonus();
//        c1.bonus();
//        System.out.println(warehouse + " " + p1 + " " + c1);

    }


}
