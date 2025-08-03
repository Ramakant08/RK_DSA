package TopInterviewQuestions;

public class SearchInRotatedSorted {
    static int solve(int[]  input,int target){
        int peak=findPeak(input);
        int index=-1;
        if(target==input[peak]){
            return peak;
        }else if(target<input[peak]&&target>input[input.length-1]){
            index=findIndex(input,0,peak,target);
        }else{
            index=findIndex(input,peak+1,input.length-1,target);
        }
        return index;
    }

    static int findPeak(int[]input){
        int start=0;
        int end=input.length-1;
        while(start<end){
            int mid=(start+end)/2;
            if(input[mid]<=input[end]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        if(start==0){
            return input.length-1;
        }
        return start-1;
    }

    static int findIndex(int[]input,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(target==input[mid]){
                return mid;
            }else if(target>input[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]input={4,5,6,7,0,1,2};
        System.out.println(solve(input,5));

    }
}
