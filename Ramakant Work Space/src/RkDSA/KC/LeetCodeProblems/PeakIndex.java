package RkDSA.KC.LeetCodeProblems;

public class PeakIndex {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println(shipWithinDays(arr,5));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int start=0;
        int end=0;
        for(int i=0; i<weights.length;i++){
            start=Math.max(start,weights[i]);
            end+=weights[i];
        }


        while(start<end){
            int mid=start+(end-start)/2;
            int sum=0;
            int partition=1;
            for(int i:weights){
                if(sum+i>mid){
                    sum=i;
                    partition++;
                }else{
                    sum+=i;
                }
            }

            if(partition<=days){
                end=mid;
            }else{
                start=mid+1;
            }
        }

        return start;
    }
}
