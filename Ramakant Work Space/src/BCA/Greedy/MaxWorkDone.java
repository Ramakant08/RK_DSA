package BCA.Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxWorkDone {
    public int calculateMaxWorkDone(int[] time1, int[] time2) {
        List<List<Integer>> timeSlots = new ArrayList<>();
        for (int i = 0; i < time1.length; i++) {
            List<Integer> currList = new ArrayList<>();
            currList.add(time1[0]);
            currList.add(time2[0]);
            timeSlots.add(currList);
        }
        timeSlots.sort((a, b) -> Integer.compare(a.get(1), b.get(1)));
        int ans = 1;
        int successfulSlot = 0;
        for (int i = 0; i < timeSlots.size(); i++) {
           if(timeSlots.get(successfulSlot).get(1)<timeSlots.get(i).get(1)){
               ans++;
               successfulSlot=i;
           }
        }

        return ans;

    }

    //TC -> O(nlogn)
    //SC-> O(n)
}
