package com.company;

public class Array_recursion {
    static boolean sorted(int []arr,int i){
        if(i==arr.length-1)
            return true;
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
    static int linear_search(int[]arr,int target,int i){
        if(i==arr.length)
            return -1;
        if(arr[i]==target)
            return i;
        else
            return linear_search(arr,target,i+1);
    }
    public static void main(String[] args) {
        int []arr={1,2,5,3,8,9};
        // System.out.println(sorted(arr,0));
        //System.out.println(linear_search(arr,9,0));

    }
}
