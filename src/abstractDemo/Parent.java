package abstractDemo;

public abstract class Parent {

    int age;
    final int value;

    public Parent(int age) {
        this.age = age;
        value = 32445;
    }

    static void hi(){
        System.out.println("Hello");
    }

    void normal(){
        System.out.println("I'm Normal Method");
    }

    abstract void career();
    abstract void partner();
}
