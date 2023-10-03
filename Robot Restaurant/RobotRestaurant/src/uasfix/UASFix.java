/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uasfix;
import java.util.*;

/**
 *
 * @author HP
 */

abstract class Menu{
    String namaMenu;
    int waktuMenu;
    
    public Menu(String namaMenu, int waktuMenu){
        this.namaMenu = namaMenu;
        this.waktuMenu = waktuMenu;
    }
    
    public abstract void buatMenu();
}

class Hotdog extends Menu{
    public Hotdog(){
        super("Hotdog", 3);
    }
    
    public void buatMenu(){
        try{
            System.out.println("Persiapan bahan Hotdog...");
            Thread.sleep(waktuMenu*300);
            System.out.println("Membuat Hotdog...");
            Thread.sleep(waktuMenu*1500);
            System.out.println("Hotdog siap disajikan.");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class FrenchFries extends Menu{
    public FrenchFries(){
        super("French Fries", 2);
    }
    
    public void buatMenu(){
        try{
            System.out.println("Persiapan bahan French Fries...");
            Thread.sleep(waktuMenu*200);
            System.out.println("Membuat French Fries...");
            Thread.sleep(waktuMenu*1000);
            System.out.println("French Fries siap disajikan.");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Drink extends Menu{
    public Drink(){
        super("Drink", 1);
    }
    
    public void buatMenu(){
        try{
            System.out.println("Persiapan bahan Minuman...");
            Thread.sleep(waktuMenu*100);
            System.out.println("Membuat Minuman...");
            Thread.sleep(waktuMenu*500);
            System.out.println("Minuman siap disajikan.");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class Hamburger extends Menu{
    public Hamburger(){
        super("Hamburger", 3);
    }
    
    public void buatMenu(){
        try{
            System.out.println("Persiapan bahan Hamburger...");
            Thread.sleep(waktuMenu*300);
            System.out.println("Membuat Hamburger...");
            Thread.sleep(waktuMenu*1500);
            System.out.println("Hamburger siap disajikan.");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

class FriedChicken extends Menu{
    public FriedChicken(){
        super("Fried Chicken", 4);
    }
    
    public void buatMenu(){
        try{
            System.out.println("Persiapan bahan Fried Chicken...");
            Thread.sleep(waktuMenu*400);
            System.out.println("Membuat Fried Chicken...");
            Thread.sleep(waktuMenu*2000);
            System.out.println("Fried Chicken siap disajikan.");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class UASFix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pilih;
        do{
            String enter;
            System.out.println("Pilih Paket : ");
            System.out.println("1. Paket A (Hotdog, French Fries, Drink)");
            System.out.println("2. Paket B (Hamburger, French Fries, Drink)");
            System.out.println("3. Paket C (Fried Chicken, French Fries, Drink)");
            System.out.println("0. Keluar");
            System.out.print("Pilihan : ");
            
            Scanner input = new Scanner(System.in);
            Scanner inputenter = new Scanner(System.in);
            
            pilih = input.nextInt();
            
            switch(pilih){
                case 1 : {
                    Hotdog hd = new Hotdog();
                    FrenchFries ff = new FrenchFries();
                    Drink d = new Drink();
                    
                    Thread hdThread = new Thread(hd::buatMenu);
                    Thread ffThread = new Thread(ff::buatMenu);
                    Thread dThread = new Thread(d::buatMenu);
                    
                    hdThread.start();
                    ffThread.start();
                    dThread.start();
                    
                    enter = inputenter.nextLine();
                    break;
                }
                case 2 : {
                    Hamburger h = new Hamburger();
                    FrenchFries ff = new FrenchFries();
                    Drink d = new Drink();
                    
                    Thread hThread = new Thread(h::buatMenu);
                    Thread ffThread = new Thread(ff::buatMenu);
                    Thread dThread = new Thread(d::buatMenu);
                    
                    hThread.start();
                    ffThread.start();
                    dThread.start();
                    
                    enter = inputenter.nextLine();
                    break;
                }
                case 3 : {
                    FriedChicken fc = new FriedChicken();
                    FrenchFries ff = new FrenchFries();
                    Drink d = new Drink();
                    
                    Thread fcThread = new Thread(fc::buatMenu);
                    Thread ffThread = new Thread(ff::buatMenu);
                    Thread dThread = new Thread(d::buatMenu);
                    
                    fcThread.start();
                    ffThread.start();
                    dThread.start();
                    
                    enter = inputenter.nextLine();
                    break;
                }
                case 0 : {
                    System.out.println("Terima kasih");
                    System.out.println(" ");
                    break;
                }
                default : {
                    System.out.println("Pilihan tidak ada");
                    System.out.println(" ");
                    break;
                }
            }
        }while(pilih!=0);
    }
}
