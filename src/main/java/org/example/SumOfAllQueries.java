package org.example;

public class SumOfAllQueries {
    public static void main(String args[]){
        int n=7;
        long[] A = {3,7,4,2,5,3,7};
        int q = 5;
        int[][] queries = {{1,0,4}, {2,0,1}, {1,3,6}, {2,3,3}, {2,0,5} };

        long totalSum=0;
        int MOD = (int)1e9+7;

        for(int i=0;i<queries.length;i++){
            int type = queries[i][0];
            int l = queries[i][1];
            int r = queries[i][2];

            if(type == 1){
                long base = A[l];
                for(int j=l; j<=r; j++){
                    A[j]= ((j-l+1) * base)%MOD;
                }
            }else{
                long sum=0;
                for(int v=l;v<=r;v++){
                    sum = (sum + A[v])%MOD;
                }
                totalSum =  (totalSum+sum)%MOD;

            }

        }
        System.out.println(totalSum);
    }
}
