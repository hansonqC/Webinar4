package generics;

/**
 * Created by lukasz on 2017-08-05.
 */
public class Pair <K,V>{
protected K First;
protected V Last;

   public Pair(K first, V last) {
       First = first;
       Last = last;
   }

    public K getFirst() {
        return First;
    }

    public void setFirst(K first) {
        First = first;
    }

    public V getLast() {
        return Last;
    }

    public void setLast(V last) {
        Last = last;
    }
}
