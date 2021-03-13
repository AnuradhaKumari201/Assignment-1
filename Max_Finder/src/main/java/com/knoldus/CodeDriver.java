package com.knoldus;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the First Interger number=");
           String firstInteger = sc.nextLine();
            System.out.print("Enter the Second Interger number=");
           String secondInteger = sc.nextLine();


           int result= Find_Max.findMaxBtwNumber(firstInteger,  secondInteger);


            System.out.println("FirstInteger=" +firstInteger  + " "+"SecondInteger="  +secondInteger  + " " + "Max of them is ="+ result);




    }
}