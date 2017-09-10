package pl.akademiakodu;

/**
 * Created by lukasz on 2017-07-17.
 */
public class Methods {
    public static void main(String[] args) {


        new Methods();
    }

    public Methods() {



    }

    //zad 1
    private int add(int a, int b) {
        return a + b;
    }

    //zad 2
    private int substract(int a, int b) {
        return a - b;
    }

    //zad 3
    private int divide(int a, int b) {
        return a * b;
    }

    //zad 5
    private boolean is(int a, int b, int c) {//konwencja boolean prefix is
        boolean answear=false;
        if ((a * a) + (b * b) == (c * c)) {
            answear = true;
        }else {
            answear = false;
        }
        return    a * a  + b*b==c*c ? true:false;  //operator trojargumentowy
        }

        // zad 6
    private int sum(int n){
        int a=0;
        while((n%10)>0){

        }


        return a;
    }

//zad 7

    private boolean isSquare(int n){

       if(n==1){
           return true;
       }
        for (int i =2;i<n;i++){
          if(Math.pow(i,2)==n){
              return true;
          }

        }
return false;
    }

//zad 8
   // private int
    }
