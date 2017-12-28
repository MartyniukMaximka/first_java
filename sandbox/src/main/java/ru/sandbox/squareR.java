package ru.sandbox;

import static java.lang.StrictMath.sqrt;

public class squareR {

     public static double s;

     public static double roundSquare(double r) {

         double p=3.14;

         s=sqrt(r/p);
         System.out.println("площадь круга с радиусом "+r+" авна "+s);

         return s;


    }
}
