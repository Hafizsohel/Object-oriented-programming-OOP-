package interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("ElectricEngine engine start");
    }

    @Override
    public void stop() {
        System.out.println("ElectricEngine engine stop");
    }

    @Override
    public void ace() {
        System.out.println("ElectricEngine engine accelerate");
    }
}
