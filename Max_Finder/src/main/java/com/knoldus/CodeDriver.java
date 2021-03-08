package com.knoldus;

import java.util.Scanner;

public class CodeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first no");
        int firstNo = sc.nextInt();
        System.out.println("Please enter second no");
        int second_no = sc.nextInt();

        System.out.println(Find_Max.find_max_no.apply(firstNo,second_no));
    }
}
