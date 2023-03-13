package com.company;

public class Array_binarysearch_recursion {
    static int binarysearch(int[]a,int target,int s,int e){
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(a[mid]==target)
            return mid;
        if(a[mid]>target)
            return binarysearch(a,target,s,mid-1);
        else
            return binarysearch(a,target,mid+1,e);
    }
    static int rotated_binarysearch(int []a,int target,int s,int e){
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(a[mid]==target)
            return mid;
        if(a[s]<=a[mid]){
            if(target>=a[s] && target<a[mid])
                return rotated_binarysearch(a,target,s,mid-1);
            else
                return rotated_binarysearch(a,target,mid+1,e);
        }
        if(target>a[mid]&& target<=a[e])
            return rotated_binarysearch(a,target,mid+1,e);
        else
            return rotated_binarysearch(a,target,s,mid-1);
    }
    public static void main(String[] args) {
        int [] arr={1,5,6,7,9,10,25,36};
        int []arr2={5,6,7,8,9,1,2,3};
        //System.out.println(binarysearch(arr,10,0,arr.length-1));
        System.out.println(rotated_binarysearch(arr2,7,0,arr2.length-1));

    }
}
