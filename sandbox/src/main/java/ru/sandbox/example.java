package ru.sandbox;

public class example {

    public static void main(String args[])
    {
     hello("world");


     Square s = new Square(5);
       // s.l = 5;
        System.out.println("Площадь квадрата со стороной "+ s.l + " = "+ area(s));


        Rectangle r = new Rectangle(5, 6);
       /* r.a = 5;
        r.b = 6;*/

        System.out.println("Площадь прямоугольника со сторонами "+ r.a +" и "+ r.b + " = "+ area(r));

    }

    public static void hello(String somebody){
        System.out.println("Юху, у меня получилось... " + somebody);
    }

    public static double area(Square s){
        return s.l*s.l;
    }

    public static double area(Rectangle r){
        return r.a*r.b;
    }

}
