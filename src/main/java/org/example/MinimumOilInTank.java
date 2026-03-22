package org.example;

public class MinimumOilInTank {

    public static void main(String[] args){
        int k=5;
        int[] A = {-1,1,1};
        int C = 3;
        int prefix = 0;
        int minPrefix = 0;
        int maxPrefix = 0;

        for(int i=0;i<A.length;i++){
            prefix += A[i];
            minPrefix = Math.min(minPrefix,prefix);
            maxPrefix = Math.max(maxPrefix,prefix);
        }

        int X = Math.max(0,-minPrefix);

        if(X > C - maxPrefix){
            X = C;
        }
        System.out.println(X);
    }
}
