package ru.sandbox;

public class Point {


    public static double a;

    public static double main (String args[])
    {
        double x1=1, x2=3, y1=1, y2=3;
       // double a;

        a = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

        System.out.println("расстояние  между точками с координатами ("+x1 + " "+ y1+") и "+"("+x2 + " "+ y2+")" + "равно:");
        System.out.println(a);
        return a;
    }


}
