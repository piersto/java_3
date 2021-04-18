package ca.qc.yul.pst.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("Vasia");
        double len = 5;
        double width = 6;

        System.out.println("Sqaare of the rectangular with side " + len + " equals to " + area(len) );
        System.out.println("Square of the rectangular with sides "
                + len + " and " + width + " equals to " + square(len, width));

    }
    public static void hello(String s) {
        System.out.println("Hello, " + s + "!");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double square (double l, double w) {
        return l * w;
    }
}