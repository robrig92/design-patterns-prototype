package app.prototypes;

/**
 * Shape
 */
public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (null != target) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Shape clone();
}