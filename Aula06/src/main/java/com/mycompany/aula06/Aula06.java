/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula06;
import java.util.Scanner;
public class Aula06 {
        
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        
        int teste;
        Scanner in = new Scanner(System.in);
        teste = 1;
        while(teste != 0){
            System.out.println("-----------------------------");
            System.out.println("Aperte 0 para sair, escolha: ");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Abrir Menu");
            System.out.println("6 - Fechar Menu");
            System.out.println("7 - Ativar Mudo");
            System.out.println("8 - Desativar Mudo");
            teste = in.nextInt();
            switch(teste){
                case 1:
                    c.ligar();
                    break;
                case 2:
                    c.desligar();
                    break;
                case 3:
                    c.maisVolume();
                    break;
                case 4:
                    c.menosVolume();
                    break;
                case 5:
                    c.abrirMenu();
                    break;
                case 6:
                    c.fecharMenu();
                    break;
                case 7:
                    c.ligarMudo();
                    break;
                case 8:
                    c.desligarMudo();
                    break;
                default:
                    System.out.println("Insira um número válido!");
            }
            
       }
       
       
    }
}
