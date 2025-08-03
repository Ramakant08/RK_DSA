package RkDSA.KC.LeetCodeProblems;

import java.util.*;

class Solution {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int []arr=new int[nums.length];
        ArrayList<Integer>arrayList=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arrayList.add(index[i],nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            arr[i]=arrayList.get(i);
        }
        return arr;
    }
    public  static int  largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0]=0;
         for (int i = 1; i <=gain.length; i++) {
            arr[i] = arr[i-1] + gain[i - 1];
        }
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) {
                max = arr[j];
            }
        }
        System.out.println(Arrays.toString(arr));

        return max;
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int [][]flippedImage=new int[image.length][image.length];
        for (int i = 0; i <image.length; i++) {
            int c=image[i].length-1;
            for (int j = 0; j <image[i].length; j++) {
              flippedImage[i][j]=image[i][c];
              c--;
              flippedImage[i][j] = flippedImage[i][j]==0?1:0;

            }
        }
        return flippedImage;
    }

    public static int oddCells(int m, int n, int[][] indices) {
      int count=0;
      int[][]mat=new int[m][n];
      
        for (int[]a:indices) {
            for (int i = 0; i < a.length; i++) {
                if(i==0){
                    for (int j = 0; j < n; j++) {
                        mat[a[i]][j]++;
                    }
                }else {
                    for (int j = 0; j <m ; j++) {
                        mat[j][a[i]]++;
                    }
                }
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if(mat[i][j]%2!=0){
                    count++;
                }
            }

        }
        return count;
    }

    public static void intForm(int arr[],int k){
          int power=arr.length-1;
          double newInt= 0L;
          for(int i=0;i<arr.length;i++){
              newInt+=arr[i]*Math.pow(10,power);
              power--;
          }
          double temp=newInt+k;
          List<Integer>list   =new ArrayList<>();
          double temp1=temp;
          int temp2;
          while(temp>0){
               temp1=temp%10;
               list.add((int) temp1);
               temp=temp/10;
          }
          int []array=new int[list.size()];
          int j=0;

        List<Integer>list1=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            list1.add(list.get(i));
        }
        System.out.println(list1);
    }

    public static List<Integer> Numarr(int []num, int k){
        final LinkedList<Integer> result = new LinkedList<>();
        int len = num.length - 1;

        while(len >= 0 || k != 0){

            if(len >= 0){
                k += num[len];
                len--;
            }

            result.addFirst(k % 10);
            k /= 10;
        }

        return result;

    }

    public  static void main(String[] args) {
        int[]nums={0,1,2,3,4};
        int[]index={0,1,2,2,1};
       int [] gain={44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
       int [][]image={{1,1,0},{1,0,1},{0,0,0}};
       int indices[][]={{0,1},{1,1}};

     //   System.out.println(Arrays.toString(image));

       // System.out.println(Arrays.toString(createTargetArray(nums,index)));
        //   System.out.println(largestAltitude(gain));
//        for (int[]l:flipAndInvertImage(image)) {
//            System.out.print(Arrays.toString(l));
//        }
//        System.out.println(oddCells(2,3,indices));
        int[]arr={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k=516;
       // Numarr(arr,k);
         System.out.println(Numarr(arr,12));
    }
}
