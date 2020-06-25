package com.tute.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Author: 田增印
 * @Date: 2020/6/24
 * @Time: 5:25
 * @Description: com.tute.array
 * https://leetcode-cn.com/problems/merge-sorted-array/
 * @VERSION: 1.0
 */
public class Leetcode88 {
    public static void main(String[] args){
     int[]  nums1 = {1,2,3,0,0,0};
     int[]  nums2 = {2,5,6};
     new Leetcode88().merge(nums1, 3,nums2 ,3 );
     System.out.println(Arrays.toString(nums1));
        System.out.println("你好哈哈哈张世杰在吗");
    }
    @Test
    public void merge2Test(){
        int[]  nums1 = {1,2,3,0,0,0};
        int[]  nums2 = {2,5,6};
        new Leetcode88().merge(nums1, 3,nums2 ,3 );
    }
    public void merge2(int[] nums1, int m, int[] nums2, int n){
        int len1 = m-1;
        int len2 = n-1;
        int len = nums1.length-1;
        while (len1>=0 && len2>=0){
            if( nums1[len1]>nums2[len2]){
                nums1[len]=nums1[len1];
                len1--;
            }else {
                nums1[len]=nums2[len2];
                len2--;
            }
            len--;
        }
        while (len1>0){
            nums1[len]=nums1[len1];
            len1--;
            len--;
        }
        while (len2>0){
            nums1[len]=nums2[len2];
            len2--;
            len--;
        }
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void merge1Test(){
        int[]  nums1 = {1,2,3,0,0,0};
        int[]  nums2 = {2,5,6};
        new Leetcode88().merge(nums1, 3,nums2 ,3 );

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] h = new int[m+n];
        int a =0,b=0,c=0;
        while (m > a && n > b){
            if(nums1[a]<nums2[b]){
                h[c]=nums1[a];
                a++;
                c++;
            }else {
                h[c]=nums2[b];
                b++;
                c++;
            }
        }
       // System.out.println(Arrays.toString(h)+a+" "+b+" "+c);
        while (m > a){
            h[c]=nums1[a];
            a++;
            c++;
        }
        while (n > b){
            h[c]=nums2[b];
            b++;
            c++;
        }
        nums1=h;
        System.out.println(Arrays.toString(nums1));
    }
}
