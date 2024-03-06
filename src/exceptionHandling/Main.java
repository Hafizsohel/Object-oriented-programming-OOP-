package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;

        try {
           // int c=a/b;
       // divide(a,b);
          //  throw new Exception("Just for fun");
            String name= "Hafiz";
            if (name.equals("Hafiz")){
                throw new MyException("Name is Hafiz");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Normal exception");
        }
        finally {
            System.out.println("This will always execute");
        }

        }
    static int divide(int a, int b) throws ArithmeticException{

        if (b == 0){
            throw new ArithmeticException("Please, do not provide zero");
        }
        return a/b;
    }
}
