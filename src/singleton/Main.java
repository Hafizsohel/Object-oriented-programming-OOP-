package singleton;

import access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        A a=new A(23,"SOHEL");
        a.getNum();

    }
}
