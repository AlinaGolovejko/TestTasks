package com.company;

import java.lang.System;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;


public class Application {

static public Float calculate (float arg1, float arg2, String operator){
   Float res = null;
      switch (operator) {
          case "-": {
              return arg1 - arg2;
          }

          case "+": {
              return arg1 + arg2;
          }
          case "*": {
              return arg1 * arg2;
          }
          case "/": {
              if (arg2 == 0){
                  System.out.println("Cannot devide by 0");
                  break;
              }
              return arg1 / arg2;
          }
          default: {
              System.out.println("Invalid operator. Try Again!");
          }
      }
   return res;
   }
}
