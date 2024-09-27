import java.awt.Shape;

public abstract class Hexagon implements Shape {
    private double side;

    public Hexagon(double side) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setLength(double side) {
        this.side = side;
    }
}
