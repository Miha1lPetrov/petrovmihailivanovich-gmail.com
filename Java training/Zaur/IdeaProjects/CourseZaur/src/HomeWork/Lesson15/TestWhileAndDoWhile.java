package HomeWork.Lesson15;

public class TestWhileAndDoWhile {

    static void time(){
        int hour = 0;
        OUTER: while (hour < 6){

            int minutes = -1;
            MID: do {
                minutes++;
                if (hour > 1 && minutes%10==0){
                    break OUTER;
                }
                int seconds = 0;
                INNER: while (seconds<60){
                    if (seconds * hour > minutes){
                        continue MID;
                    }
                    System.out.println(hour + " : " + minutes + " : " + seconds);
                    seconds++;
                }
            }while (minutes<59);
        hour++;
        }
    }

    public static void main(String[] args) {
        time();
    }

}
