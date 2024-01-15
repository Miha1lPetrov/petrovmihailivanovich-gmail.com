package HomeWork.Lesson7;

public class Employee {
    int id = 1;
    public String surname = "Vasya";
    private double salary = 500;

    public void EmployeeId(){
        System.out.println("id: " + id);

    }
    public void EmployeeSurname(){
        System.out.println("surname: " + surname);
    }
    public void EmployeeSalary(){
        System.out.println("salary: " + salary);
    }

    public Employee(int id, String surname, double salary){
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

//    private Employee(int id, String surname, double salary){
//        this.id = id;
//        this.surname = surname;
//        this.salary = salary;
//    }
//    Employee(int id, String surname, double salary){
//        this.id = id;
//        this.surname = surname;
//        this.salary = salary;
//    }

    public static void main(String[] args) {
        //Employee emp = new Employee();
    }

}
