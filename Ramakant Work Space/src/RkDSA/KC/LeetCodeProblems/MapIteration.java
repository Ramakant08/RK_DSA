package RkDSA.KC.LeetCodeProblems;

import java.util.*;

public class MapIteration {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "afsd");
        map.put(2, "vbfg");
        map.put(3, "vnghdf");
        map.put(4, "uyutyt");
        map.put(5, "fvcvf");
        map.put(6, "zdasda");
        map.put(7, "gbrfgd");
        map.put(8, "64543");

        //using combination of foreach and keyset
        for (int key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        //using keysetIterator
        Iterator<Integer> keysetIterator = map.keySet().iterator();
        while (keysetIterator.hasNext()) {
            int key = keysetIterator.next();
            System.out.println(key + " : " + map.get(key));
        }

        //using combination of entryset and foreach
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }


}
