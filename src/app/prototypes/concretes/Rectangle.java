package app.prototypes.concretes;

import app.prototypes.Shape;

/**
 * Rectangle
 */
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (null != target) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "{" +
            " width='" + getWidth() + "'" +
            ", height='" + getHeight() + "'" +
            "}";
    }
}