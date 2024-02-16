package day012.Task02;

import java.util.ArrayList;
import java.util.List;

public class EvenNum {
    public static void main(String[] args) {

        List<Integer> evenNum = new ArrayList<>();

        for (int i = 0; i < 351; i++) {
            if (i>=0 && i<=30){
                if (i%2==0){
                    evenNum.add(i);
                }
            } else if (i >= 300 && i < 351) {
                if (i % 2 ==0){
                    evenNum.add(i);
                }
            }
        }

        for (Integer i : evenNum){
            System.out.println(i);
        }


    }
}
