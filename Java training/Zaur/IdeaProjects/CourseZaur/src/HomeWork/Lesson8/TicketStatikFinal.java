package HomeWork.Lesson8;

public class TicketStatikFinal {
    static int proizvedenie(int a, int b, int c){
        return a*b*c;
    }
    static void delenie(int a, int b){
        System.out.println("celoe " + (a/b));
        System.out.println("ostatok " + (a%b));
    }
}

class Test {
    public static void main(String[] args) {

        int result = TicketStatikFinal.proizvedenie(5,5,5);
        System.out.println(result);
        TicketStatikFinal.delenie(101,10);
        //тк они статичные вызываем через имя класса TicketStatikFinal, объект не создавали
    }


}
