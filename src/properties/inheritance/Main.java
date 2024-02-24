package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box(4,3,4);
        box.getL();

        Box box2=new Box(box);
        //System.out.println(box.l +" "+box.h+ " "+box.w);

/*        BoxWeight box3=new BoxWeight();
        BoxWeight box4=new BoxWeight(1,2,3,4);
        System.out.println(box3.h+ ""+box3.weight);*/

       /* Box box5=new BoxWeight(2,3,4,5);
        System.out.println(box5.w);*/

        //There are  many variables in both parent and child classes
        //you are given access to variable that are in reference type i.e. BoxWeight
        //hence, you should have access to weight variable.
        //This also means, that ones you are trying to access should be initialised
        //but here, when the obj itself is of type parent class, how will you call the constructor of the child class
        //BoxWeight box6=new Box(2,3,4,5);
       // System.out.println(box5.w);



       // BoxPrice box=new BoxPrice(5,8,200);
    }
}
