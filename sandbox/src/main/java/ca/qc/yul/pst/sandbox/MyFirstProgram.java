package ca.qc.yul.pst.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Vasia");
        double width = 6;

        Square s = new  Square(5);
        System.out.println("Square of the rectangular with side " + s.l + " equals to " + s.area() );

        Rectangle r = new Rectangle(7, 8);
        System.out.println("Square of the rectangle with sides " + r.a +", " + r.b + " equals to " + r.area());
    }
    public static void hello(String s) {
        System.out.println("Hello, " + s + "!");
    }



}