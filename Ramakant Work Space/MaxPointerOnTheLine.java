public class MaxPointerOnTheLine {
    public static int maxPoints(int[][] points) {
        int maxPointer = 0;
        if (points.length == 1) {
            return 1;
        }
        for (int referencePoint = 0; referencePoint < points.length; referencePoint++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int slopePointer = referencePoint + 1; slopePointer < points.length; slopePointer++) {
                int x1 = points[referencePoint][0];
                int y1 = points[referencePoint][1];
                int x2 = points[slopePointer][0];
                int y2 = points[slopePointer][1];
                double slope;
                if (x2 == x1) {
                    slope = Double.MAX_VALUE;
                } else {
                    slope = (double) (y2 - y1) / (x2 - x1);
                }
                if (map.containsKey(slope)) {
                    map.put(slope, map.get(slope) + 1);
                } else {
                    map.put(slope, 1);
                }
                maxPointer = Math.max(maxPointer, map.get(slope) + 1);
            }
        }
        return maxPointer;
    }

    public static void main(String[] args) {
        System.out.println(maxPoints(new int[][]{{2, 3}, {3, 3}, {-5, 3}}));
    }
}
