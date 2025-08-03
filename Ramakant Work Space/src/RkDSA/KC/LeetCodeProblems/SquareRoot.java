package RkDSA.KC.LeetCodeProblems;

public class SquareRoot {

    public static void main(String[] args) {
        int num=808201;
        boolean square=isPerfectSquare(num);
        System.out.println(square);
    }
    public static boolean isPerfectSquare(int num) {
        int start=1;
        int end=num/2;
        if(num==0||num==1){
            return true;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid<num){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return false;
    }
}
