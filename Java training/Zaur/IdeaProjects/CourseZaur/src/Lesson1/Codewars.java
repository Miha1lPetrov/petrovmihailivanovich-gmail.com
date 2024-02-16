package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Codewars {

    public static int sortDesc(final int num) {
        String strNum = String.valueOf(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strNum.length(); i++) {
            sb.append(strNum.charAt(i) + " ");
        }
        String[] a1 = sb.toString().split(" ");
        int[] arrayNum = new int[a1.length];
        for (int i = 0; i < a1.length; i++) {
            arrayNum[i] = Integer.parseInt(a1[i]);
        }

        for (int i = 0; i < arrayNum.length-1; i++) {
            for (int j = i; j < arrayNum.length-1; j++) {
                if (arrayNum[i] < arrayNum[j +1]){
                    int t = arrayNum[j + 1];
                    arrayNum[j+1] = arrayNum[i];
                    arrayNum[i] = t;
                }
            }
        }
        
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < arrayNum.length; i++) {
            sb2.append(arrayNum[i]);
        }
        int b3 = Integer.parseInt(sb2.toString());

        return b3;
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(123));


    }
}
