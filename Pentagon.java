import java.awt.Shape;

public abstract class Pentagon implements Shape {
    private double side;

    public Pentagon(double side) {
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
