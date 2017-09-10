package generics;

/**
 * Created by lukasz on 2017-08-05.
 */
public class Vector3D<T, U, S> {
    protected T v1;
    protected U v2;
    protected S v3;

    public Vector3D(T v1, U v2, S v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector3D<?, ?, ?> vector3D = (Vector3D<?, ?, ?>) o;

        if (!v1.equals(vector3D.v1)) return false;
        if (!v2.equals(vector3D.v2)) return false;
        return v3.equals(vector3D.v3);
    }

    public T getV1() {
        return v1;
    }

    public void setV1(T v1) {
        this.v1 = v1;
    }

    public U getV2() {
        return v2;
    }

    public void setV2(U v2) {
        this.v2 = v2;
    }

    public S getV3() {
        return v3;
    }

    public void setV3(S v3) {
        this.v3 = v3;
    }

    @Override
    public int hashCode() {
        int result = v1.hashCode();
        result = 31 * result + v2.hashCode();
        result = 31 * result + v3.hashCode();
        return result;
    }
}
