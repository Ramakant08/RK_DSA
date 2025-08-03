package TopInterviewQuestions;

public class SingleElement {
    static int getElement(int[] input) {
        int start = 0;
        int end = input.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid % 2 == 0) {
                if (mid >= 0 && mid < input.length - 1 && input[mid] == input[mid + 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (mid >= 0 && mid < input.length - 1 && input[mid] == input[mid + 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(getElement(arr));
    }
}
