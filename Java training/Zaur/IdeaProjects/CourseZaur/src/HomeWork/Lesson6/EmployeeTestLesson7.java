package HomeWork.Lesson6;

public class EmployeeTestLesson7 {
    public static void main(String[] args) {
        HomeWork.Lesson7.Employee emp = new HomeWork.Lesson7.Employee(3, "Kolya", 1500);
//        //1)Действия при условии что конструктор public + методы public
//
//        //System.out.println(emp.salary); Отдельно НЕ вызвать salary тк private
//        //Далее переписал метод разбив на 3 метода для каждого параметра(поля класса)
//        emp.EmployeeId();
//        emp.EmployeeSurname();
//        emp.EmployeeSalary(); //при условии что Salary private то через public метод посмотреть можно это вроже инкапсуляция
//        //Вывведем значения полей через sout
//
//        //System.out.println(emp.id + " " + emp.surname + " " + " Значение отдельно не вызвать тк private");
        /*тут уже проблема при вызове НЕ МЕТОДОВ public с ними все норм, а одельно через sout вывести значение id не получится тк оно дефолтное + private у salary */


        //2)Действия при условии что конструктор дефолтный ( дефолтный то виден ВНУТРИ ПАКЕТА ) будет так же как и с public
        /*все он НЕ Видит данный конструктор так же и с private*/
    }
}
