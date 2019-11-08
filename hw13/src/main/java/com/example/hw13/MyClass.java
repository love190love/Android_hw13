package com.example.hw13;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入您的性別 ");
        System.out.println("男生請輸入1 女生請輸入2");
        int i=scanner.nextInt();
        System.out.println("您的年齡: ");
        int j=scanner.nextInt();
        if((i==1)&&(j>=18))
            System.out.println("您可以合法結婚 ");
        if((i==1)&&(j<18))
            System.out.println("您不可以合法結婚 ");
        if((i==2)&&(j>=16))
            System.out.println("您可以合法結婚 ");
        if((i==2)&&(j<16))
            System.out.println("您不可以合法結婚 ");
    }
}

