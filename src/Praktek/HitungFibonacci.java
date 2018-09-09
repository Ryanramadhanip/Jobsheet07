/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktek;
import java.util.Scanner;
/**
 *
 * @author Ryan Ramadhani
 */
public class HitungFibonacci {
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);;
        System.out.println("\nHitung Fibonacci");
        System.out.println("l, 1, 2, 3, 5, 8, 13, 21, .,. dst.\n");
    }
    
    public static void main(String[] args)
    {
        String identitas = "Ryan Ramadhani Putra / X RPL 2 / 29";
        tampilJudul(identitas);
        
        int n = tampilInput();
    }
    
    public static int tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan ke-: ");
        int n = scanner.nextInt();
        return n;
    }
}
