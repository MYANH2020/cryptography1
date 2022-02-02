package Assignment1;
import java.util.Scanner;

public class GCD {
    // java program to demonstrate Basis Euclidean Algorithm
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integer numbers");
        // read 2 inputs from the user
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= gcd(a,b);
        // print out the result
        System.out.println(" GCD of ("+a+","+b+")"+"   " +c);
    }
    // function to find gcd of a, b
    public static int gcd(int a, int b) {
        while (b != 0) {
            if (a < b) {
                return gcd(b,a);
            }
            int r = a % b;
            //we replace a with b and b with r
            a = b;
            b = r;
        }
        return a;
    }



}
