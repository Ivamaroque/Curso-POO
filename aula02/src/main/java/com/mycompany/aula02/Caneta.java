/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status(){
        System.out.println("Uma caneta "+this.cor+" modelo "+this.modelo);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("Com ponta "+this.ponta+" e com carga de "+this.carga+"%");
    }
    public void rabiscar(){
        if(this.tampada){
            System.out.println("Erro! Estou tampada.");
        }
        if(!this.tampada){
            System.out.println("Estou rabiscando.");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
