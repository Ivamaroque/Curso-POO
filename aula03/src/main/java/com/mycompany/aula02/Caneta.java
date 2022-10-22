/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta "+this.cor+" modelo "+this.modelo);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Com ponta "+this.ponta+" e com carga de "+this.carga+"%");
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("Erro! Estou tampada.");
        }
        if(!this.tampada){
            System.out.println("Estou rabiscando.");
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
