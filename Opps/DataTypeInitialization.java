package Opps;

public class DataTypeInitialization {
    public static class Student{
        int roll;
        String name;
        int id;
    }

    public static void main(String[] args) {
        Student s=new Student();
        System.out.println(s.id=1);
        System.out.println(s.name="Kiram");
        System.out.println(s.roll=12);

    }
}
