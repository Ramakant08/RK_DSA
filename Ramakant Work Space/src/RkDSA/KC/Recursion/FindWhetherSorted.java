package RkDSA.KC.Recursion;

public class FindWhetherSorted {

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,8,6,7};
        System.out.println(checkSortedOrder(arr,0));
    }
    public static boolean checkSortedOrder(int[]arr,int index){

        if (index==arr.length-1){
            return true;
        }

        if(arr[index]>arr[index+1]){
            return false;
        }

        return checkSortedOrder(arr,index+1);
    }
}
