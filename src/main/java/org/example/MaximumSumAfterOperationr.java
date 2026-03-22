package org.example;

public class MaximumSumAfterOperationr {

   public static void main(String[] args){
        int N = 3;
        int x = 3;
        int y = 3;
        int z = 3;

        int[] A = {1,2,3};
        int[] B = {1,2,3};


       int sum = 0;

       for(int v=1;v<=N;v++){
            if( x-1 >= 0 && y-1 >= 0) {
                x-=1;
                y-=1;
                sum += A[v-1]*x*y*z;
            }else if( y-1 >= 0 && z-1 >= 0){
                y-=1;
                z-=1;
                sum += A[v-1]*x*y*z;
            }else{
                sum-=B[v-1];
            }

       }
       System.out.println("Ans: "+sum);

   }


}
