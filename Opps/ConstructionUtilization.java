package Opps;

public class ConstructionUtilization {
    static class Student{
        String name;
        int roll;
        int[] mark;

//        public Student(int s) {
//             mark=new int[s];
//        }
        //Another method
        public Student(int[] arr){
            mark=arr;
        }
    }
    public static void main(String[] args) {
        int[] arr={23,21,34,56};
        Student s=new Student(arr);
//            Student s=new Student(4);
//            Student s1=new Student(3);
            s.name="Akash";
            s.roll=123;
//            s.mark[0]=90;
//            s.mark[1]=92;
//            s.mark[2]=95;
//            s.mark[3]=97;
        System.out.println(s.name+" "+s.roll+" "+s.mark[0]);
    }
}
