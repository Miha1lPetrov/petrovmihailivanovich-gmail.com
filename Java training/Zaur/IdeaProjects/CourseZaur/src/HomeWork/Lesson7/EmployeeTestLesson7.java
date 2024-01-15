package HomeWork.Lesson7;

public class EmployeeTestLesson7 {
    public static void main(String[] args) {

        //1)Действия при условии что конструктор public + методы public
        HomeWork.Lesson7.Employee emp = new HomeWork.Lesson7.Employee(2, "Dima", 1000);//emp.EmployeeMeaning(); //Работает при условии что метод public или дефолт ( или protected) Это был общий метод для всех 3ех параметров
//        //System.out.println(emp.salary); Отдельно НЕ вызвать salary тк private
//        //Далее переписал метод разбив на 3 метода для каждого параметра(поля класса)
//        emp.EmployeeId();
//        emp.EmployeeSurname();
//        emp.EmployeeSalary(); //при условии что Salary private то через public метод посмотреть можно это вроже инкапсуляция
//        //Вывведем значения полей через sout
//        System.out.println(emp.id + " " + emp.surname + " " + " Значение отдельно не вызвать тк private");

        //2)Действия при условии что конструктор дефолтный ( дефолтный то виден ВНУТРИ ПАКЕТА ) будет так же как и с public
         //System.out.println(emp.salary); //Отдельно НЕ вызвать salary тк private
//        //Далее переписал метод разбив на 3 метода для каждого параметра(поля класса)
//        emp.EmployeeId();
//        emp.EmployeeSurname();
//        emp.EmployeeSalary(); //при условии что Salary private то через public метод посмотреть можно это вроже инкапсуляция
//        //Вывведем значения полей через sout
//        System.out.println(emp.id + " " + emp.surname + " " + " Значение отдельно не вызвать тк private");

        //4)Действия с private не дают вообще создать объект данного класса
        //на строке 7 будет гореть ошибка

        //3)Действие 3 создаем класс в пакете HomeWork.Lesson6 и проверяем там

    }
}
