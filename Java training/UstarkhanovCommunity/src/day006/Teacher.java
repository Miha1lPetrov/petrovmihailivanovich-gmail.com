package day006;

import java.util.Random;

public class Teacher {
    private String name;
    private String lesson;

    public Teacher(String name, String lesson){
        this.name = name;
        this.lesson = lesson;
    }

//    public void evaluate(Student st){
//        int estimation = (int)(Math.random()*5)+1;
//        String estimationStr = "";
//        if (estimation == 5){
//            estimationStr = "отлично";
//        } else if (estimation == 4) {
//            estimationStr = "хорошо";
//        } else if (estimation == 3) {
//            estimationStr = "удовлетворительно";
//        }else {
//            estimationStr = "неудовлетворительно";
//        }
//        System.out.printf("Преподаватель %s оценил студента с именем %s " +
//                "по предмету %s на оценку %s \n", name, st.getName(), lesson, estimationStr);
//    }

    public void evaluate(Student st){
        Random random = new Random();
        int randomValue = random.nextInt(4)+2;
        String estimation = "";

        switch (randomValue){
            case 2:
                estimation = "неудовлетворительно";
                break;
            case 3:
                estimation = "удовлетворительно";
                break;
            case 4:
                estimation = "хорошо";
                break;
            case 5:
                estimation = "отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s " +
                "по предмету %s на оценку %s \n", name, st.getName(), lesson, estimation);
    }


}
