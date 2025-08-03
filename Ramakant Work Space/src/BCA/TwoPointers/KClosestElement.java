package BCA.TwoPointers;

import java.util.ArrayList;
import java.util.List;
//To solve the problem of finding the k closest elements to a given
//number x in a sorted array, we use a two-pointer approach. Since
//the array is already sorted, the closest elements to x must lie within a
//continuous window of size k. We start with two pointers: st at the beginning
//of the array and end at the end. Our goal is to shrink the window from both ends
//until its size becomes exactly k. At each step, we compare the absolute difference
//between x and the elements at the two ends (arr[st] and arr[end]). If the left element
// (arr[st]) is farther from x than the right element (arr[end]), we move the start
//pointer forward (st++) to exclude the less relevant left element. Otherwise, we move the end
//pointer backward (end--). We repeat this process until the window contains exactly k elements.
// After that, we collect and return all the elements from arr[st] to arr[end] as the result.
//This method efficiently finds the k closest numbers while
//preserving their sorted order, without needing to sort or use additional complex data structures.
public class KClosestElement {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int size = arr.length;
        int left = 0;
        int right = arr.length - 1;
        while (size > k) {
            if (x - arr[left] <= arr[right] - x) {
                right--;
                size--;
            } else {
                left++;
                size--;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findClosestElements(arr, 4, -1));
    }
}
