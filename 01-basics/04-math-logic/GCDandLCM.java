/**
 * 01-java-basics/step-08-math-and-logical-programs: GCDandLCM.java
 * =================================================================
 * Core Concepts Demonstrated:
 * 1. Greatest Common Divisor (GCD / HCF) using Euclidean Algorithm ($O(\log(\min(a,b)))$).
 * 2. Least Common Multiple (LCM) formula: $LCM(a, b) = \frac{a \times b}{GCD(a, b)}$.
 */
public class GCDandLCM {

    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("     GCD (HCF) & LCM Calculation Demo    ");
        System.out.println("=========================================");

        int num1 = 36;
        int num2 = 60;

        int gcd = calculateGCD(num1, num2);
        long lcm = calculateLCM(num1, num2);

        System.out.println("Number 1  : " + num1);
        System.out.println("Number 2  : " + num2);
        System.out.println("GCD (HCF) : " + gcd);
        System.out.println("LCM       : " + lcm);

        System.out.println("=========================================");
    }

    // Euclidean Algorithm for GCD (Recursive)
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    // LCM using GCD relation
    public static long calculateLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        int gcd = calculateGCD(a, b);
        return ((long) a * b) / gcd;
    }
}
