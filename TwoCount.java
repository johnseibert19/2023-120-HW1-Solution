/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg120.hw1.tutor;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Counts how many twos are in a power of two.
 * @author John Seibert
 */
public class TwoCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        BigInteger base = BigInteger.TWO;
        Scanner scan = new Scanner(System.in);
        int exp = scan.nextInt();
        BigInteger result = base.pow(exp);
        String resConvert = String.valueOf(result);
        int count = resConvert.length() - resConvert.replace("2", "").length();
        System.out.println(count);
        // resConvert = resConvert.replaceAll("[^2]", ""); (regex based approach)
        // System.out.println(resConvert.length());
    }
    
}
