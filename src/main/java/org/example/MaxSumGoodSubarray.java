package org.example;
import java.util.*;
public class MaxSumGoodSubarray {
    public static void main(String[] args){

        int k = 5;
        int[] A = {-1,1,3,2,-1};
        Map<Integer,Integer> mpp = new HashMap<>();

        int sum=0,maxSum=Integer.MIN_VALUE;
        int l=0,r=0;
        while(r < A.length){
            mpp.put(A[r],mpp.getOrDefault(A[r],0)+1);
            sum += A[r];

            while(mpp.size() > k) {
                mpp.put(A[l],mpp.get(A[l])-1);
                sum -= A[l];

                if (mpp.get(A[l]) == 0){
                    mpp.remove(A[l]);
                }
                l++;
            }
            // Kadane-like reset
            if(sum < 0){
                mpp.clear();
                sum = 0;
                l = r + 1;
            }
            maxSum = Math.max(maxSum,sum);
            r++;
        }
        if(maxSum<0)
            maxSum=0;
        System.out.println("MaxSum: "+maxSum);
    }
}
