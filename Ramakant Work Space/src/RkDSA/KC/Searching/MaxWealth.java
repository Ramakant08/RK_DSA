package RkDSA.KC.Searching;

public class MaxWealth {

    static String  returnMaxWealth(int [][]accounts){
        int sum=0;
        int max=0;
        int person=0;
        for (int i = 0; i <accounts.length; i++) {
            for (int j = 0; j <accounts[i].length ; j++) {
                sum=sum+accounts[i][j];
            }
            if(sum>max){
                max=sum;
                person=i+1;
            }
            sum=0;
        }

        return  "person with maxwealth is: "+person;
    }

    public static void main(String[] args) {
        int [][]account={
                {123,234,432,554},
                {432,453,534,234},
                {443,889,1000,2000},
                {1,2,3}
        };

        System.out.println(returnMaxWealth(account));

    }
}
