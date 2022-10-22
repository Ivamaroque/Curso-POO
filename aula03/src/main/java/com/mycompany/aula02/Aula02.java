/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula02;


public class Aula02 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.modelo = "Bic";
        c1.ponta = 0.5f;
        c1.carga = 100;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        System.out.println("\n");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.ponta = 0.05f;
        c2.carga = 50;
        c2.destampar();
        
        c2.status();
        c2.rabiscar();
    }
}
