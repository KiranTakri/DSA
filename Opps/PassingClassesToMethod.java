package Opps;

public class PassingClassesToMethod {
    public static void main(String[] args) {
        Car car=new Car();
        car.name="Maruti Suzuki";
        car.seats=4;
        car.price=800000;
        car.type="Petrol";
        System.out.println(car.seats);
        change(car);
        System.out.println(car.seats);
    }
    static void change(Car c){
        c.seats=5;
    }
}
class Car{
    String name;
    int seats;
    int price;
    String type;
}
