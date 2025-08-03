package RkDSA.KC.LeetCodeProblems;

public class NumberInWords {

    public static void main(String[] args) {
        int[] arr = convertIntintoWords(40);
        String wordString = numberWordString(arr);
    }

    private static String numberWordString(int[] arr) {
        String[] ones = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] ties = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] higher = {"hundred", "thousand", "lakh", "crore"};
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            int indexInNum = arr.length - i;
            if (i > 0 && arr[i] != 1 && indexInNum != 1) {
                s += ties[arr[i] - 1];
            }
        }
//        s += ones[arr[i]-1]+" ";
        System.out.println(s);
        return "";
    }

    public static int[] convertIntintoWords(int i) {
        int[] arr = convertToInterArray(i);
        return arr;
    }

    private static int[] convertToInterArray(int i) {
        int count = getSizeOfNumber(i);
        int numberArray[] = new int[count];
        int temp = i;
        int counter = numberArray.length - 1;
        while (i > 0) {
            temp = i % 10;
            i = i / 10;
            numberArray[counter] = temp;
            counter--;
        }
        return numberArray;
    }

    private static int getSizeOfNumber(int i) {
        int count = 0;
        int temp = i;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        return count;
    }
}
