/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08;
import java.util.Scanner;
public class Contoh02 {
    public static void main(String[] args)
    {
        Scanner baca = new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.print("Silahkan Masukkan Bilangan : ");
        y = baca.nextInt();
        
        // PERULANGAN FOR
        for(x = 1; x <= y; x++)
        {
            System.out.print(x + " ");
        }
        
        //PERULANGAN WHILE
        x = 1;
        while(x <= y)
        {
            System.out.print(x + " ");
            x++;
        }
        
        //PERULANGAN DO WHILE
        x = 1;
        do
        {
            System.out.print(x + " ");
            x++;
        }
        while(x <= y);
    }
}
