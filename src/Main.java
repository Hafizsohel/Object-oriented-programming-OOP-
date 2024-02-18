import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      //  Student[]students=new Student[5];

        Student hafiz=new Student(13,"NASIF",90.0f);

        Student random=new Student();
     /*   hafiz.num= 10;
        hafiz.name ="Hafizur Rahman";*/
        //hafiz.marks = 90.0f;

        /*hafiz.changeName("SOHEL");
        hafiz.getting();*/

        Student random2=new Student();
        System.out.println("Random 2 name: "+random2.name);


        System.out.println(hafiz.num);
        System.out.println(hafiz.name);
        System.out.println(hafiz.marks);


        System.out.println(" ");
        Student randomNew=new Student(hafiz);
        System.out.println(randomNew.name);

        Student one = new Student();
        Student two= one;

        one.name= "Something something";
        System.out.println(two.name);


    }
}

class Student{
    int num;
    String name;
    float marks;

    void getting(){
        System.out.println("My name is: "+this.name);
    }
    void changeName(String newName){
        name=newName;
    }

    Student(Student other){
        this.num=other.num;
        this.name= other.name;;
        this.marks=other.marks;

    }

   /* Student(){
        this.num=13;
        this.name="Hafizur Rahman Sohel";
        this.marks=88.5f;
    }*/


    Student(){
        this(12,"Default Person",100.0f);
    }

    //Student Shafi=new Student(17,"Shafi",89.0f);
    //Here, this will be replaced with Shafi
    Student(int num, String name, float marks){
        this.num=num;
        this.name=name;
        this.marks=marks;
    }
}