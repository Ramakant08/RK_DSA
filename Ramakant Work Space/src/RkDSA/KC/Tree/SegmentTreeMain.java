package RkDSA.KC.Tree;

public class SegmentTreeMain {
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        BinarySegmentTree segmentTree = new BinarySegmentTree(arr);
        segmentTree.display();
        System.out.println(segmentTree.query(1, 6));
    }

}
