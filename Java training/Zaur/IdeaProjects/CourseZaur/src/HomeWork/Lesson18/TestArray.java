package HomeWork.Lesson18;

import java.util.Arrays;

public class TestArray {

    static int[] sorting(int [] array){ //отсортировали без метода sort()

        while (true){
            boolean flag = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]){
                    int t = array[i];
                    array[i] = array[i+1];
                    array[i+1] = t;
                    flag = true;
                }
            }
            if (flag == false){
                return array;
            }
        }
    }

    static void showArray(String array[][]){ //просто красивый вывод без метода deepToString
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < array[i].length; j++) {
                if (j+1 == array[i].length){
                    System.out.print(array[i][j]);
                }else{
                    System.out.print(array[i][j] + " , ");
                }
            }
            if (i+1 == array.length){
                System.out.print(" }");
            }else {
                System.out.print(" },");
            }
        }
        System.out.print("}");
    }




    public static void main(String[] args) {
        int [] array = {5, 10, -32, - 3, 102, 145, 123};
        TestArray.sorting(array);
        //System.out.println(Arrays.toString(array));

        String [][] array1 = {{"Элемент00", "Элемент01"}, {"Элемент"}, {"Элемент02", "Элемент03", "Элемент04"}};
        System.out.println(Arrays.deepToString(array1));
        TestArray.showArray(array1);
    }

}
