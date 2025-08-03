package RkDSA.KC.Sorting;

public class FindMissing {

    public static void main(String[] args) {
        int[] arr = {4, 3, 0, 1, 2, 5};
        int missingNumber = returnMissingInTheRange(arr);
        System.out.println(missingNumber);
    }

    public static int returnMissingInTheRange(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }
}
