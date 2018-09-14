/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
import java.util.Scanner;
/**
 *
 * @author Ryan Ramadhani
 */
public class Tugas01 {
    public static void main(String[] args)
    {
        String identitas = "Ryan Ramadhani / X RPL 2 / 29";
        System.out.println("Identitas = " + identitas);
        
        // Deklarasi
        int[] data = new int[] {5000, 2000, 1000, 500, 100};
        Scanner baca = new Scanner(System.in);
        
        // Proses
        System.out.print("Masukkan Jumlah Uang : ");
        int uang = baca.nextInt();
        
        for(int i = 0; i < data.length; i++)
        {
            int jumlah = uang / data[i];
            uang = uang - (data[i] * jumlah);
            
            System.out.println("Lembar " + data[i] + " = " + jumlah);
        }
    }
}
