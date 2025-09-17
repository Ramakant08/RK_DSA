package BCA.Greedy;

import java.util.Arrays;

public class AssignMiceToHoles {
    public int assignHoles(int[] miceLocation, int[] holeLocation) {
        Arrays.sort(miceLocation);
        Arrays.sort(holeLocation);

        int mineTimeToAcquireHoles = -1;
        for (int i = 0; i < miceLocation.length; i++) {
            mineTimeToAcquireHoles = Math.max(mineTimeToAcquireHoles, Math.abs(miceLocation[i] - holeLocation[i]));
        }

        return mineTimeToAcquireHoles;

    }
}
