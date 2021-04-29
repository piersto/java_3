package ca.qc.yul.pst.sandbox;

public class Equality {
    public static void main(String[] args) {
        String s1 = "firefox";
        String s2 = s1;

        System.out.println(s1 == s2);
        System.out.println(s2.equals(s2));
    }
}
