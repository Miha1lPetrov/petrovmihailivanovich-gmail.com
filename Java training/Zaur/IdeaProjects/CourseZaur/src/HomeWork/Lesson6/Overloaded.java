package HomeWork.Lesson6;

public class Overloaded {

    int sum(){
        return 0;
    }
    int sum(int a){
        return a;
    }
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        Overloaded o = new Overloaded();
        System.out.println(o.sum(5,5,5,5));
    }

}
