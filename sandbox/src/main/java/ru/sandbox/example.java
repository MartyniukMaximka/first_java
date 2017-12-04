package ru.sandbox;

public class example {

    public static void main(String args[])
    {
     hello("world");
     double l=5;
        System.out.println("Площадь квадрата со стороной "+ l + " = "+ area(l));

     double a=5, b=6;
        System.out.println("Площадь прямоугольника со сторонами "+ a +" и "+ b + " = "+ area(a, b));

    }

    public static void hello(String somebody){
        System.out.println("Юху, у меня получилось... " + somebody);
    }

    public static double area(double l){
        return l*l;
    }

    public static double area(double a, double b){
        return a*b;
    }

}
