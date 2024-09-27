/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author damt202
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        String[] command = {"notepad"};
        ProcessBuilder pb= new ProcessBuilder();
        
        System.out.println("Hello World!");
        System.out.println("Esto es otra lína");
        

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        

         System.out.println("Prueva de Distitna rama");
         
         try {
            Process p= pb.start();
        } catch (IOException e) {
        }
        

    }
}
