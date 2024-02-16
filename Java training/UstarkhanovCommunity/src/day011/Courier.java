package day011;

public class Courier implements Worker{
    private int salary;
    public int getSalary(){
        return salary;
    }

    //Наши рабочие и склад никак не связаны чтоюы увеличивать кол-во собраных заказов или баланс
    //для того чтобы эту связь создать, нам необходимо передать в каждый класс рабочего ссылку на класс склада
    //делается это следующим образом:

    private Warehouse warehouse;//в приватном поле у каждого класса сотрудника создается ссылка на класс скалада
    //и для того чтобы эту ссылку передать можно использовать либо сеттер либо в конструкторе это реализовать ( сделаем через конструктор)

    public Courier(Warehouse warehouse) {//Необходим передавать в конструктор ТОЛЬКО ПОЛЕ СКЛАД потому что зп указывать при создании
        this.warehouse = warehouse;     //рабочего смысла нету
    }
    @Override
    public void doWork() {
        this.salary +=80;
        //warehouse.; //Сейчас получить знчения не можем тк у склада поля private добавляем геттеры и сеттеры для приватных полей
        warehouse.setBalance(warehouse.getBalance()+1000); //Увеличиваем значение на 1000 если работает метод doWork() у Курьера

    }

    @Override
    public void bonus() {
        if (warehouse.getBalance() > 1_000_000){
            salary*=2;
        }

    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                '}';
    }
}
