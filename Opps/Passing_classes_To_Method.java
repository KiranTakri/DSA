package Opps;

public class Passing_classes_To_Method {
    static class Carr{
        String name;
        int seats;
        int price;
        String type;
        void Print(){
            System.out.println(name+" "+seats+" "+price+" "+type);
        }
    }

        public static void main(String[] args) {
            Carr car=new Carr();
            car.name="Maruti Suzuki";
            car.seats=4;
            car.price=800000;
            car.type="Petrol";
            System.out.println(car.seats);
            change(car);
            System.out.println(car.seats);
            car.Print();

        }
        static void change(Carr c){
            c.seats=5;
        }
    }


