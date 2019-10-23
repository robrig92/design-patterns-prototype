package app.prototypes.concretes;

import app.prototypes.Shape;

/**
 * Circle
 */
public class Circle extends Shape {

    private float radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (null != target) {
            this.radius = target.radius;
        }
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "{" +
            " radius='" + radius + "'" +
            "}";
    }
}