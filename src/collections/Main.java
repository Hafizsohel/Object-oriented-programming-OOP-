package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();

        list.add(24);
        list2.add(90);
        list2.add(70);
        list2.add(40);
        list2.add(20);
        list2.add(30);
        System.out.println(list2);


        List<Integer>vector=new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(55);

        System.out.println(vector);

    }

}
