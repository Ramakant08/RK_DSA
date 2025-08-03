package RkDSA.KC.Searching;

public class CeilingOfCharacter {
    public static char searchCielingOfChar(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (start == letters.length) {
            return letters[0];
        }
        return letters[start];
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'd', 'e'};
        char target = 'c';
        System.out.println(searchCielingOfChar(letters, 'b'));
    }
}
