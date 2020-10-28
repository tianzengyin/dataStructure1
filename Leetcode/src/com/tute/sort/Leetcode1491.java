package com.tute.sort;

import com.tute.tools.Tool;

import java.util.Arrays;

/**
 * @Author: 田增印
 * @Date: 2020/10/28
 * @Time: 8:56
 * @Description: com.tute.sort
 *              1491. 去掉最低工资和最高工资后的工资平均值
 *              https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 *              给你一个整数数组 salary ，数组里每个数都是 唯一 的，
 *              其中 salary[i] 是第 i 个员工的工资。
 *              请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
 *
 * @VERSION: 1.0
 */
public class Leetcode1491 {
    public static void main(String[] args){
        int[] salary = Tool.generateIntArray(10, 1000, 5000);
        //int[] salary = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
        int[] salary1 = new int[salary.length] ;
        System.arraycopy(salary, 0, salary1, 0, salary.length);
        for (int i : salary) {
            if(i!=salary[salary.length-1] ){
                System.out.print(i+"-");
            }else {
                System.out.println(i);
            }

        }
        for (int i : salary1) {
            if(i!=salary1[salary1.length-1] ){
                System.out.print(i+"-");
            }else {
                System.out.println(i);
            }
        }
        double average = average2(salary);
        double average1 = average1(salary);
        System.out.println(average);
        System.out.println(average1);
    }
    public static double average(int[] salary) {
        int isChange;
        for (int i = 0; i < salary.length-1; i++) {
            //isChange = 0;
            for (int j =0;j<salary.length-i-1;j++){
               if(salary[j]>salary[j+1] ){
                    int temp = salary[j];
                    salary[j] = salary[j+1];
                    salary[j+1] = temp;
                   //isChange = 1;
               }
            }
            /*if(isChange==0 ){
             break;
            }*/
        }
        int sum=0;
        for (int i = 1; i <salary.length-1 ; i++) {
            sum+=salary[i];
        }
        System.out.println(sum);
        double result  = sum/(salary.length-2.0) ;
        return result;
    }

    public static double average1(int[] salary){
        int max = Arrays.stream(salary).max().getAsInt();
        int min = Arrays.stream(salary).min().getAsInt();
        int sum = Arrays.stream(salary).sum();
        return (sum-max-min)/(salary.length-2.0);

    }
    public static double average2(int[] salary) {
        double sum = 0;
        double maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
        for (int num : salary) {
            sum += num;
            maxValue = Math.max(maxValue, num);
            minValue = Math.min(minValue, num);
        }
        return (sum - maxValue - minValue) / (salary.length - 2);
    }

}
