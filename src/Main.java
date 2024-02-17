import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[]students=new Student[5];

        Student hafiz=new Student();
        System.out.println(hafiz.num);

    }
}

class Student{
    int[] num= new int[5];
    String[] name=new String[5];
    float[]marks=new float[5];
}