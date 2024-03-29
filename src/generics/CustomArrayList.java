package generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList {

    private int[] data;
    private int DEFAULT_SIZE=10;
    private int size=0;

    private CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int [] temp= new int[data.length * 2];
        for (int i=0; i<data.length; i++){
            temp[i] = data [i];
        }
        data =temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int removed= data[--size];
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index]= value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        //ArrayList list=new ArrayList();
        CustomArrayList list=new CustomArrayList();
      /*  list.add(3);
        list.add(5);
        list.add(10);*/

        for (int i=0; i< 14; i++){
            list.add(2*i);
        }

        System.out.println(list);

        ArrayList<String>list1=new ArrayList<>();
        list1.add("hfkasdg");
    }
}
