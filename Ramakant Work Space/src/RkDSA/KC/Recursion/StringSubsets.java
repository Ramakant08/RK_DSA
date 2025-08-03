package RkDSA.KC.Recursion;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSubsets {

    public static void main(String[] args) {
        String string = "abc";
//        subset("", string);
        ArrayList<String> list = new ArrayList<>();
//        subsetArrayList("", string, list);
//        System.out.println(subsetArrayList("", string));
        System.out.println(subsetArrayListAscii("", string));
    }

    public static void subset(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        //taking element
        subset(processed + unProcessed.charAt(0), unProcessed.substring(1));
        //ignoring element
        subset(processed, unProcessed.substring(1));

    }

    public static void subsetArrayList(String processed, String unProcessed, ArrayList<String> subsetList) {
        if (unProcessed.isEmpty() && !processed.isEmpty()) {
            subsetList.add(processed);
            return;
        }
        if (unProcessed.isEmpty() && processed.isEmpty()) {
            return;
        }
        //taking element
        subsetArrayList(processed + unProcessed.charAt(0), unProcessed.substring(1), subsetList);
        //ignoring element
        subsetArrayList(processed, unProcessed.substring(1), subsetList);
    }

    public static ArrayList<String> subsetArrayList(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> left = subsetArrayList(processed + unProcessed.charAt(0), unProcessed.substring(1));
        ArrayList<String> right = subsetArrayList(processed, unProcessed.substring(1));
        left.addAll(right);
        return left;
    }


    public static ArrayList<String> subsetArrayListAscii(String processed, String unProcessed) {
        if (unProcessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> left = subsetArrayListAscii(processed + unProcessed.charAt(0), unProcessed.substring(1));
        ArrayList<String> right = subsetArrayListAscii(processed, unProcessed.substring(1));
        ArrayList<String> asciiPart = subsetArrayList(processed + (int) unProcessed.charAt(0) + unProcessed.charAt(0), unProcessed.substring(1));
        left.addAll(right);
        left.addAll(asciiPart);
        return left;
    }


}
