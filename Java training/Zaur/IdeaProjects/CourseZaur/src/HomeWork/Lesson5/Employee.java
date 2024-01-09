package HomeWork.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;
    Employee (int id, String surname, int age, double salary, String department){
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    double uvelichilZp(){
        salary*=2;
        return salary;
    }

}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Vasya", 25, 100,"vertuhai");
        Employee emp2 = new Employee(2,"Dimon", 30, 200, "veertuhai2.0");
        System.out.println(emp1.salary);
        emp1.uvelichilZp();
        System.out.println(emp1.salary);

    }

}
