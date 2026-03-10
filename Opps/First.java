package Opps;

public class First {
    static class Bike{
        int price;
        int mil;
        String name;
        void Print(){
            System.out.println("Name:- "+name+" Price "+price+" mil "+mil);
        }
    }
    public static void main(String[] args) {
        Bike b=new Bike();
        b.price=20000;
        b.name="Gt650";
        b.mil=18;
        b.Print();
    }
}
