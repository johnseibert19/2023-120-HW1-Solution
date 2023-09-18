/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg120.hw1.tutor;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * Displays the next prime after a concatenation of an inputted number 
 * and so many "copies" of the inputted number.
 * @author John Seibert
 */
public class PrimeAfterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter two positive integers: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int copies = scan.nextInt();
        String origNum = String.valueOf(number);
        origNum = origNum.repeat(copies);
        BigInteger obj = new BigInteger(origNum);
        obj = obj.nextProbablePrime();
        System.out.println(obj);
    }
    
}
