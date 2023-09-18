/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg120.hw1.tutor;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Squares, reverses, and squares a number.
 * @author John Seibert
 */
public class SquareReverseSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        Scanner scan = new Scanner(System.in);
        int orig = scan.nextInt();
        orig = orig * orig;
        StringBuilder squared = new StringBuilder();
        squared.append(orig);
        squared.reverse();
        String conv = squared.toString();
        BigInteger toBigInt = new BigInteger(conv);
        toBigInt = toBigInt.pow(2);
        System.out.println(toBigInt);
    }
    
}
