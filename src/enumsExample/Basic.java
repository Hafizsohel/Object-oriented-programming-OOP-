package enumsExample;

public class Basic {

    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //These are enum constants
        //public, static and final you can create child enums
        //since its final you call
        //type is Week

        Week(){
            System.out.println("Constructor call for "+this.toString());
        }

        @Override
        public void hello() {
            System.out.println("Hi! How are you.");
        }
    }


    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        week.hello();

        System.out.println(Week.valueOf("Monday"));

        /*for (Week day: Week.values()){
            System.out.println(day);
        }*/

       // System.out.println(week.ordinal());
    }
}
