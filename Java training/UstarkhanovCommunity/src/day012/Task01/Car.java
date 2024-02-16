package day012.Task01;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public static void main(String[] args) {
        List<String> brandCar = new ArrayList<>(){{
            add("BMW");
            add("Lada");
            add("kia");
            add("Porche");
            add("Exeed");
        }};

        System.out.println(brandCar);
        System.out.println("------------------------");

        int valueIndex = 0;
        if (brandCar.size() % 2 == 0){
            valueIndex = brandCar.size()/2;
        }else {
            valueIndex = brandCar.size()/2 + 1;
        }

        brandCar.add(valueIndex, "Honda");
        System.out.println(brandCar);
        brandCar.remove(0);

        System.out.println(brandCar);
    }
}
