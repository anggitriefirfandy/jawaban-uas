/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author anggit rief irfandy
 */
public class stackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(7);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        System.out.println("nilai teratas = "+ tumpukan.peek());
        System.out.println("nama saya adalah anggit rief irfandy");
        System.out.println("nilai yang dihapus = "+ tumpukan.pop());
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println();
        
    }
    
}

   
