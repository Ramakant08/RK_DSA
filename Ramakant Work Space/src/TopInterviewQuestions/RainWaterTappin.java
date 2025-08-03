package TopInterviewQuestions;

public class RainWaterTappin{
    static int trap(int[]  input){
        int max=0;
        int[]left=new int[input.length];
        int[]right=new int[input.length];
        left[0]=input[0];
        for(int i=1;i<input.length;i++){
           left[i]=Math.max(left[i-1],input[i]);
        }
        right[input.length-1]=input[input.length-1];
        for(int i=input.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],input[i]);
        }
        int sum=0;
        int min=0;
        for(int i=0; i<input.length; i++){
            sum+=Math.min(left[i],right[i])-input[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}