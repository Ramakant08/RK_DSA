package BCA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Anagram {
    static boolean check(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (String s : str1.split("")) {
            if (map1.containsKey(s)) {
                map1.put(s, map1.get(s) + 1);
            } else {
                map1.put(s, 1);
            }
        }

        for (String s : str2.split("")) {
            if (map2.containsKey(s)) {
                map2.put(s, map2.get(s) + 1);
            } else {
                map2.put(s, 1);
            }
        }

        for (String s : map1.keySet()) {
            if (!Objects.equals(map2.get(s), map1.get(s))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("gram","arm"));
    }
}
