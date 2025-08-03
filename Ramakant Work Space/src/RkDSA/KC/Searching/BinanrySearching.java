package RkDSA.KC.Searching;

public class BinanrySearching {

    public static int search(int a[], int target) {
        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (a[mid] == target) {
                return mid;
            }
            if (a[0] < a[a.length - 1]) {     //if array is sorted ascending order
                if (target < a[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {                        // if array is sorted in descending order
                if (target < a[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6, 7, 8, 23, 56, 91};
        int target = 23;
        System.out.println(search(a, target));

    }
}
