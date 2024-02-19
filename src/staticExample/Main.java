package staticExample;

public class Main {
    public static void main(String[] args) {
       /* Human hafiz=new Human(22,"Hafizur Rahman",30000,false);
        Human abrar=new Human(22,"Abrar Jahir",20000,false);
        Human rana=new Human(22,"Ariful Islam Rana",25000,false);

        System.out.println(hafiz.population);
        System.out.println(rana.population);*/

    }

    //This is not dependent on objects
    static void fun() {
        //greeting(); //You can't use this because it requires an instance
        //but the function you are using it in does not depend on instances
        //a static context

        Main obj=new Main();
        obj.greeting();


    }

    //we know that something which is not static, belongs to an object
    void greeting() {
        System.out.println("Hello Rana");
    }
}
