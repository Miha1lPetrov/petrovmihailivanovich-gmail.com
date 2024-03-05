package Lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Codewars {

    public static int countPassengers(ArrayList<int[]> stops) {
        int come = 0;
        int get = 0;
        int sum = 0;
        for (int i = 0; i < stops.size(); i++) {
            for (int j = 0; j < stops.get(i).length-1; j++) {
                sum += stops.get(i)[j] - stops.get(i)[j+1];
                continue;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));


    }
}
