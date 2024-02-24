package properties.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight= -1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); //present class constructor --used to initialise values present in parent class
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
        super(other);
        weight=other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight=weight;
    }

}
