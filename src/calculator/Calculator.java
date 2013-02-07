/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Pulkit
 */
import java.util.Scanner;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double val = 0;
        double ans;
        int i = 0;
        Scanner Input = new Scanner(System.in);
        boolean Yes = true;

        do {


            if (i == 0) {
                System.out.println("SV:");
                ans = Input.nextDouble();
            } else {
                ans = val;
            }
            System.out.println("F:");
            String Function = Input.next();


            switch (Function) {
                case "+":
                    System.out.println("A:");
                    double a = Input.nextDouble();
                    val = Functions.add(ans, a);
                    break;
                case "-":
                    System.out.println("S:");
                    double s = Input.nextDouble();
                    val = Functions.sub(ans, s);
                    break;
                case "*":
                    System.out.println("M:");
                    double m = Input.nextDouble();
                    val = Functions.mult(ans, m);
                    break;
                case "/":
                    System.out.println("D:");
                    double d = Input.nextDouble();
                    val = Functions.dev(ans, d);
                    break;


            }
            i++;

            System.out.println("Ans" + "\n" + val);

        } while (Yes);



    }
}
}
