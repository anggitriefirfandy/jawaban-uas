/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antrian;

/**
 *
 * @author anggit rief irfandy
 */
public class AntrianApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Antrian antrian = new Antrian (10);
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.println("Nama saya adalah anggit rief irfandy ");
        
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        
    }
}
