package bai3;

import java.util.Arrays;

public class Point22D {
    private float x = 1.0f;
    private float y = 1.0f;

    public Point22D() {

    }

    public Point22D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] XY = {this.x, this.y};
        return XY;
    }

    public String toString() {
        return "Mảng là : " + Arrays.toString(getXY());
    }
}