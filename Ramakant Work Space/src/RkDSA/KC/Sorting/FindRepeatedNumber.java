package RkDSA.KC.Sorting;

public class FindRepeatedNumber {

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 2, 5};
        System.out.println(searchRepeatedNumber(arr));
    }

    public static int searchRepeatedNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    int temp = arr[correct];
                    arr[correct] = arr[i];
                    arr[i] = temp;
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
