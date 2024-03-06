package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human hafiz = new Human(24, "Hafizur Rahman");
        //Human twin=new Human(hafiz);

        Human twin = (Human) hafiz.clone();
        System.out.println(twin.age+ " "+twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;
        System.out.println(Arrays.toString(hafiz.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
