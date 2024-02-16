package day011;

public class Picker implements Worker{
    private int salary;
    public int getSalary(){
        return salary;
    }

    //Наши рабочие и склад никак не связаны чтоюы увеличивать кол-во собраных заказов или баланс
    //для того чтобы эту связь создать, нам необходимо передать в каждый класс рабочего ссылку на класс склада
    //делается это следующим образом:

    private Warehouse warehouse;//в приватном поле у каждого класса сотрудника создается ссылка на класс скалада
    //и для того чтобы эту ссылку передать можно использовать либо сеттер либо в конструкторе это реализовать ( сделаем через конструктор)

    public Picker(Warehouse warehouse) {//Необходим передавать в конструктор ТОЛЬКО ПОЛЕ СКЛАД потому что зп указывать при создании
        this.warehouse = warehouse;     //рабочего смысла нету
    }

    @Override
    public void doWork() {
        this.salary += 100;
        //warehouse.; //Сейчас получить знчения не можем тк у склада поля private добавляем геттеры и сеттеры для приватных полей
        warehouse.setCountOrder(warehouse.getCountOrder()+1); //Увеличиваем значение на 1 если работает метод doWork()

    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() > 1500){
            salary*=3;
        }

    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
