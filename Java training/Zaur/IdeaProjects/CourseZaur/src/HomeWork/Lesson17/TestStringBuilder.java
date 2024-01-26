package HomeWork.Lesson17;

public class TestStringBuilder {

    public static boolean equalsSB(StringBuilder sb1, StringBuilder sb2){
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        if (s1.equals(s2)){
            return true;
        }
        return false;
    }

    public static boolean equalsSB2(StringBuilder sb1, StringBuilder sb2){

        if (sb1.length() == sb2.length()){
            int count = 0;
            for (int i = 0; i < sb1.length(); i++) {
                if (sb1.charAt(i) == sb2.charAt(i)){
                    count++;
                }
            }
            if (count == sb1.length()){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("hello");
        StringBuilder sb3 = new StringBuilder("hella");
        StringBuilder sb4 = sb1;
        StringBuilder sb5 = new StringBuilder("Hello");
        System.out.println(equalsSB2(sb1, sb5));

    }

}
