package TopInterviewQuestions;

public class ProductOfArrayExceptItself {
    public static int[] product(int[] arr) {
        int[] leftArr = new int[arr.length];
        leftArr[0] = 1;
        for (int i = 1; i < leftArr.length; i++) {
            leftArr[i] = leftArr[i - 1] * arr[i - 1];
        }
        int[] rightArr = new int[arr.length];
        rightArr[arr.length - 1] = 1;
        for (int i = arr.length - 2; i >= 0; i--) {
            rightArr[i] = rightArr[i + 1] * arr[i + 1];
        }
        int[] productArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            productArray[i] = leftArr[i] * rightArr[i];
        }
        return productArray;
    }
}
