/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.aula05;

import java.util.HashSet;

/**
 *
 * @author Admin
 */
public class Aula05 {

    public static void main(String[] args) {
        Banco b1 = new Banco();
        b1.setNumConta(6315);
        b1.setDono("Jubileu");
        b1.abrirConta("cc");
        b1.depositar(100);
        b1.sacar(150);
        
        Banco b2 = new Banco();
        b2.setNumConta(4837);
        b2.setDono("Maria");
        b2.abrirConta("cp");
        b2.depositar(500);
        b2.sacar(100);
        
        b1.fecharConta();
        b1.estadoAtual();
        b2.estadoAtual();
    }
}
