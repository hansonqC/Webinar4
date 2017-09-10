package generics;

import java.util.*;

/**
 * Created by lukasz on 2017-08-05.
 */
public class CollectionsOperations {
// przekazywanie przez wartosc - metoda robi kopie zmiennej x
    //czyli x nie jest referencj�
    void f(long x){
        x++;
    }
//   x Napisz uniwersaln� metod� fromArrayToCollectionprzepisuj�c� elementy z tablicy do kolekcji. Powinni�my m�c wywo�a� t� metod� dla par tablica-kolekcja z r�nymi typami, jednak w ramach pary typypowinnyby� zgodne np.:
//            -String[] tab, Collection<String> col
//-Integer[] tab, Collection<Integer> col
//    Przetestuj dzia�anie tej metody.
//

    //tablice oraz obiekty w Javie sa przekazywane przez referencje
    public static<T> void fromArrayToCollection(T[]tab, Collection<T>coll){
       for(T t:tab){
           coll.add(t); //lepsze rozwiazanie, szybsze
       }

       coll.addAll(Arrays.asList(tab));


    }

    public static void main(String[] args) {
        String []t= {"ala","xyz","www","ala","xyz"};
        // w liscie elementy moga sie powtarzac
        Set<String> set=new TreeSet<>();

        List<String> list=new LinkedList<>();
        fromArrayToCollection(t,set);

        System.out.println(set.toString());

        Arrays.sort(t);  //sortowanie tablicy jednowymiarowej

        for(String s : t){
            System.out.print(s+ " ");
        }
        Collections.sort(list);
        System.out.println(list);
    }

//    <T extends B1 & B2 & B3>
//    przyk�ad:
//    classA { /* ... */ }interfaceB { /* ... */}interfaceC { /* ... */}classD <T extends A & B & C> { /* ... */ }
//    typ T musi rozszerza� klas� A i implementowa� interfejsy B i C. UWAGA: A musi by� zadeklarowana jako pierwsza (b��d w trakcie kompilacji)
//    Zawsze klase jako pierwsz�.
}
