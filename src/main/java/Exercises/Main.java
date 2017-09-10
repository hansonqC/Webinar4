package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

// Pierdolone zadanie z kolekcji z prezentacji
public class Main {
    public static void main(String[] args) {
        Test test=new Test();
        Main main = new Main();
        main.add();

        String[] names={"jola","marek","ania","ania","jola","bartek","bartek","franek","bartek","konrad","marek","ania","jola","franek","bartek","bartek","bartek","konrad","marek","ania"};
        List<String> lista=Arrays.asList(names);
ArrayList<String>list=new ArrayList<>();
list.addAll(lista);
        System.out.println(test.count(list));
       test.countMap(list);



    }
    void add(){
        System.out.println("dddd");
    }
}
