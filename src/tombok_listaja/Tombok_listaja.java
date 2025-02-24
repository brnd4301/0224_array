/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombok_listaja;

/**
 *
 * @author boton
 */
public class Tombok_listaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        
        // Tömb 1D
        //lineáris: ([1][2][3][4]...)
        //Fix méretűek, mérete nem változtatható
        //Indexelés
        /*
            [10 3 5 7 8] => 5 elemű
             0  1 2 3 4  => elemszám
             5. index --> hiba
        */
        
        //Tömb létrehozása
        //típus[] neve = new tipus[maxelemszám];
        int[] szamok = new int[2]; // 2 elemű tömb
        //üresen 0-kat tartalmaz
        
        //Tömb[index]
        szamok[0] = a; //Tömb 1. eleme az 'a' értékben lévő elem lesz
        szamok[1] = b; //Tömb 2. eleme a 'b' értékben lévő elem lesz
        //szamok[2] = 4; //Hibás; mivel csak 2 elemű
        
        System.out.printf("Számok[0] = %d", szamok[0]);
        System.out.printf("Számok[1] = %d", szamok[1]);
        
        //tömb elemszám, hossza
        int hossz = szamok.length;
        System.out.println("A számok tömb hossza:" + hossz);
    }
    
}
