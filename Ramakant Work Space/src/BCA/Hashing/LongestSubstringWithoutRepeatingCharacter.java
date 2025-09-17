package BCA.Hashing;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        Set<String> set = new HashSet<>();
        int maxLength = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right) + "")) {
                set.add(s.charAt(right) + "");
                int length = right - left + 1;
                maxLength = Math.max(maxLength, length);
                right++;
            } else {
                while (left < s.length() && set.contains(s.charAt(right) + "")) {
                    set.remove(s.charAt(left) + "");
                    left++;
                }
            }
        }
        return maxLength;
    }

}
