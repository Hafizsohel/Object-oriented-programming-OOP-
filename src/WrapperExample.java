public class WrapperExample {
    public static void main(String[] args) {
        /*int a=10;
        int b=20;
        Integer num= 45;*/

        Integer a=10;
        Integer b=20;



        swap(a,b);
        System.out.println(a+" "+b);

       /* final int bonus=2;
        bonus=3;*/

        final A hafiz=new A("Hafizur Rahman");
        hafiz.name="Others name";

        //when a non primitive is final, you cannot reassign it.
       // hafiz=new A("New Object");

        A obj=new A("Rahfhkahofa");
        System.out.println(obj.toString());


        /*for(int i=0; i < 1000; i++){
        obj= new A("Random name");
        }*/

    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        b=a;
        b=temp;
    }
}
class A{
    final int num=10;
    String name;

    public A(String name) {
       // System.out.println("Object Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
