/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

//Kezia Foejiono - 2540131014 - LA20 - Object Oriented Programming
package com.mycompany.encryptionprog;
import java.util.*;
import java.lang.Math;

/**
 *
 * @author HP
 */
public class Encryptionprog {

    static String[] inputkalimat(){
        System.out.print("Masukkan kalimat yang akan dienkripsi : ");
        Scanner inp = new Scanner(System.in).useDelimiter("\n");
        String kalimat = inp.next();
        String utuh[] = {kalimat};
        return utuh;
    }
    
    static void encryp(String utuh[]){
        int x = utuh.length;
        char kata[][] = new char[x][];
        int i=0;
        for(i=0; i<x; i++){
            kata[i] = utuh[i].toCharArray();
        }
        int kalimatke = 1;
        for(char huruf[] : kata){
            for(char hrf : huruf){
                if(hrf=='a'||hrf=='i'||hrf=='u'||hrf=='e'||hrf=='o'||hrf=='A'||hrf=='I'||hrf=='U'||hrf=='E'||hrf=='O'){
                    int enc = kalimatke + kalimatke*kalimatke + (int)hrf;
                    System.out.print(enc);
                }
                else{
                    System.out.print(hrf);
                }
                if(hrf == ' '){
                    kalimatke++;
                }
            }
            kalimatke++;
            System.out.print(" ");
        }
    }
    
    public static void main(String[] args) {
        String utuh[] = inputkalimat();
        System.out.print("Hasil enkripsinya : ");
        encryp(utuh);
    }
}
