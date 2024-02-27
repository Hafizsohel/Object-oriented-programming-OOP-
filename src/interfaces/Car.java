package interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I brake normal Car");
    }

    @Override
    public void start() {

        System.out.println("I start like a normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal Car");

    }

    @Override
    public void ace() {
        System.out.println("I accelerate normal Car");

    }
}
