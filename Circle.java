import java.awt.Shape;

public abstract class Circle implements Shape {
    private double radius;

    public Circle(int x, int y, double radius) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}