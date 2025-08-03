package RkDSA.KC.Recursion;


import java.util.ArrayList;

//to return the arraylist containing the indices of target element
public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 5, 6};
        System.out.println(search(arr, 4, 0));
    }

    public static ArrayList<Integer> search(int[] arr, int target, int index) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (index == arr.length) {
            return arrayList;
        }
        if (arr[index] == target) {
            arrayList.add(index);
        }
        ArrayList<Integer> list = search(arr, target, index + 1);
        arrayList.addAll(list);

        return arrayList;
    }
}
