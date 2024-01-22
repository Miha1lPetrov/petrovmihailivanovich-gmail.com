package HomeWork.Lesson13;

public class Month {

    void quantityDay(int numMoth){

        switch (numMoth){
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 день");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 дней");
                break;
            case 2:
                System.out.println("28 дней");
                break;
            default:
                System.out.println("нет такого месяца");

        }

    }

    public static void main(String[] args) {

        Month m = new Month();
        m.quantityDay(-2);




    }

}
