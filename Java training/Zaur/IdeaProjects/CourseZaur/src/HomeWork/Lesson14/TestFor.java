package HomeWork.Lesson14;

public class TestFor {

    public static void time(){
        OUTER: for (int hour = 0; hour < 6 ; hour++) {
            MID: for (int minutes = 0; minutes < 60; minutes++) {
                INNER: for (int seconds = 0; seconds < 60; seconds++) {
                    if (hour > 1 && minutes%10==0){ //проверку на час и минуты лучше перенести в мид цикл чтобы не было частой проверки
                        break OUTER;
                    } else if (seconds * hour > minutes) {
                        continue MID;
                    }
                    System.out.println(hour + " : " + minutes + " : " + seconds);
                }
            }
        }
    }

    public static void main(String[] args) {

        TestFor.time();

    }
}
