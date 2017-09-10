package PowtorzenieOOP;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Punkt2D {
    private  int X;
    private int Y;

    public Punkt2D() {
        this(0,0);   //DON'T repeat Yourself
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Punkt2D(int x, int y) {
        X = x;
        Y = y;
    }

    public void setX(int x) {
        X = x;
    }

    public void setY(int y) {
        Y = y;
    }
}
