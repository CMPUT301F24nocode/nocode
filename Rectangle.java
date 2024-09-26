import java.awt.Shape;

public abstract class Rectangle implements Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        super();
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return this.length;
    }

    public void setBreadth(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return this.breadth;
    }

    public void setLength(double breadth) {
        this.breadth = breadth;
    }
}