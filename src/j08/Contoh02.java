/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08;

public class Contoh02 {
    public static void main(String[] args)
    {
        // PERULANGAN FOR
        int x;
        for(x = 1; x <=10; x++)
        {
            System.out.print(x + " ");
        }
        
        //PERULANGAN WHILE
        x = 1;
        while(x <= 10)
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
        while(x <= 10);
    }
}
