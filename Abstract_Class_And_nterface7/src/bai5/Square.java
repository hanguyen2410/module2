package bai5;

public class Square extends Rectangle implements Resizeable {
    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square witd side = "
                + getSide()
                + ", Which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.width *= percent;
        this.length *= percent;
    }
}