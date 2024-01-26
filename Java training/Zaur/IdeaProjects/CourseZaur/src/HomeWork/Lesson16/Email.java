package HomeWork.Lesson16;

public class Email {

    public static void emailInfo(String email) {
        String s1 = "";
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                index1 = i;
            }
            if (email.charAt(i) == '.') {
                index2 = i;
                s1 = email.substring(index1 + 1, index2);
                System.out.println(s1);
            }
        }
    }

    public static void emailInfo2(String email){
        int a = 0; //@
        int b = 0;//.
        int c = 0;//;

        while (c < email.length()-1){
            a = email.indexOf('@', c);
            b = email.indexOf('.',c);
            c = email.indexOf(';',c+1);

            System.out.println(email.substring(a+1,b));
        }
    }

    public static void main(String[] args) {
        //emailInfo("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
        emailInfo2("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
