package generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Student hafiz = new Student(12, 89.0f);
        Student rana = new Student(1, 84.0f);
        Student pavel = new Student(13, 84.0f);
        Student arif = new Student(6, 84.0f);
        Student sagor = new Student(9, 84.0f);

        Student [] list ={hafiz,rana,pavel,arif,sagor};
        System.out.println(Arrays.toString(list));

        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });

        System.out.println(Arrays.toString(list));
        if (hafiz.compareTo(rana) > 0 ) {
            System.out.println("Compare result: "+hafiz.compareTo(rana));
            System.out.println("Hafiz has more mark");
        }
    }
}
