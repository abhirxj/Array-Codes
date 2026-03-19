package org.example;

public class MissingElement {
    public static void main(String[] args){
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int sum=0,actual=0;
        int n=nums.length-1;
        for(int i=0;i<=nums.length;i++){
            actual+=i;
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int ans =  actual-sum;

        System.out.println(ans);
    }
}
