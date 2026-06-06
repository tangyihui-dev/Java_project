package com.yihui.studentctrl;

import java.util.Scanner;

//写一个"学生成绩管理器"控制台程序，
//能输入5个学生的成绩，
//计算平均分、最高分、最低分，用方法封装每个功能。
public class Student {
    public static void main(String[] args) {
        //1,定义一个方法用来接受五个学生的成绩
        int []arr=new int [5];
        arr=score();
        //2,定义不同方法来计算平均值，最高分，最低分
        //3,定义一个方法用来输出结果
        print(arr);
    }
    //定义一个方法用来接受五个学生的成绩
    public static int[] score(){
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5;) {
            System.out.println("请输入第"+(i+1)+"个学生的成绩:");
            arr[i]=sc.nextInt();
            if (arr[i]>=0&&arr[i]<=100){
                i++;
            }else {
                System.out.println("输入的分数有误，请重新输入:");
            }
        }
        return arr;
    }
    //定义一个方法用来计算平均值
    public static double avg(int[] arr){
        //定义一个变量用来保存这几个数的和
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        //计算平均值
        return sum/arr.length;
    }
    //定义一个方法用来计算最高分
    public static int max(int[] arr){
        //定义一个变量保存最高分
        int max=arr[0];
        //循环计算找出最大值
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        //返回最高分
        return max;
    }
    //定义一个方法用来计算最低分
    public static int min(int[] arr){
        //定义一个变量保存最低分
        int min=arr[0];
        //循环计算找出最低分
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    //定义一个方法用来输出结果
    public static void print(int[] arr){
        //定义一个循环用来给用户选择需要的功能
        while (true){
            System.out.println("请选择功能:");
            System.out.println("1.平均值");
            System.out.println("2.最高分");
            System.out.println("3.最低分");
            System.out.println("4.退出");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("平均值为:"+avg(arr));
                    break;
                case 2:
                    System.out.println("最高分是:"+max(arr));
                    break;
                case 3:
                    System.out.println("最低分是:"+min(arr));
                    break;
                case 4:
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入有误，请重新输入:");
            }
            System.out.println("--------------------------------");
        }
    }
}
