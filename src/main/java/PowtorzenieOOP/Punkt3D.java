package PowtorzenieOOP;

/**
 * Created by lukasz on 2017-07-22.
 */
public class Punkt3D extends Punkt2D {


        private int Z;

    public Punkt3D() {
        super();
        Z = 0;
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        Z = z;
    }

    public int getZ() {
        return Z;
    }
}
