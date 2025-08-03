package RkDSA.KC.Recursion;

public class LinearSearchUsingRecursion {

    public static void main(String[] args) {
        int[]arr={1,3,4,5,6,7,8,9};
        int target=1;
        System.out.println(search(arr,target,0));
    }
    public static int search(int[]arr,int target,int index){
        if(index==arr.length){
            return -1;
        }

        if(arr[index]==target){
            return index;
        }

        return search(arr,target,index+1);
    }
}
