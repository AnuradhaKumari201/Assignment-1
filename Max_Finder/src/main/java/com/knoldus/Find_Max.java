package com.knoldus;

import javax.management.AttributeValueExp;
import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Find_Max  {

    public static Integer findMaxBtwNumber(String firstInteger, String secondInteger){
   try {

       IntBinaryOperator intBinaryOperator = Math::max;

       int result = intBinaryOperator.applyAsInt(Integer.parseInt(firstInteger), Integer.parseInt(secondInteger));

       return result;
   }

   catch (Exception e){
       System.out.println("Please enter first number -> " +e);
       throw new NumberFormatException();
   }

     }
}
