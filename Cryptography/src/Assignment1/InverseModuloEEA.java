package Assignment1;
// java program to find modular inverse of a under modulo m
// using extended Euclidean Algorithm
import java.util.Scanner;
public class InverseModuloEEA {
    // driver code for inverse
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter 2 numbers");
        // read value from user's input
        // value number1
        int a = sc.nextInt();
        // value number 2
        int m = sc.nextInt();
        // define the value of result to print out
        int res= modInverse(a,m);
        System.out.println(" the inverse of "+ a+" modulo "+m+" is "+res);
    }
// return the inverse of a modulo m using extended Euclidean algorithm when a and m is relative prime
    // for example, gcd(a,m)=1
    public static int modInverse(int a, int m){
        int m0=m;
        int y =0, x=1;
        if(m==1)
        return 0;
        while(a>1) {
            // quo is the quotient
            int quo = a / m;
            int t = m;
            // m is remainder now
            m = a % m;
            a = t;
            t = y;
            // update x and y
            y = x - quo * y;
            x = t;
        }
        // make x positive
        if(x<0)
            x+=m0;
        return x;

        }




    }







