package Exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lukasz on 2017-08-04.
 */
public class Test {

    public String count(ArrayList<String> list) {

        ArrayList<String> dubble = new ArrayList<>();
        for (String string : list) {
            for (String string2 : list) {
                if (!dubble.contains(string2)) {
                    dubble.add(string2);
                }
            }
        }

        for (int j=0;j<dubble.size();j++) {
            int counter = 0;
            for (int i=0;i<list.size();i++) {
                if (dubble.get(j).equals(list.get(i))){
                    counter++;
                }
            }

           dubble.set(j,dubble.get(j)+" - "+counter+" razy");
            counter=0;
        }

        return dubble.toString();
    }


    public void countMap(ArrayList<String>list){
        Map<String,Integer> map=new HashMap<String,Integer>();



            for(String string:list) {
                if (map.containsKey(string)) {
                    map.put(string, map.get(string) + 1);
                } else {
                    map.put(string, 1);
                }

            }
        System.out.println(map);
    }
//={"jola","marek","ania","jola","bartek","konrad","marek","ania"};
}
