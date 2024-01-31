package HomeWork.Lesson021ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Test {

//    public static ArrayList abc(String ... s){
//
//        ArrayList <String> list = new ArrayList<>();
//        for (int i = 0; i < s.length; i++) {
//            list.add(s[i]);
//        }
//        Collections.sort(list);
//        while (true){
//            boolean flag = false;
//            for (int i = 0; i < list.size()-1; i++) {
//                System.out.println(i);
//                if (list.get(i).equals(list.get(i+1))){
//                    list.remove(i+1);
//                    flag = true;
//                }
//            }
//            if (flag == false){
//                break;
//            }
//        }
//        return list;
//    }
    
    //Можно было сделать проще пример ниже

    public static ArrayList abc(String ... s){

        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            if (!(list.contains(s[i]))){
                list.add(s[i]);
            }
        }
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args) {
        ArrayList <String> s = new ArrayList<>();
        s = Test.abc("odin", "dva", "tri", "kuku", "odin", "odin", "odin", "tri");
        System.out.println(s.toString());
    }


}
