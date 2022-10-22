/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula06;

import java.util.logging.Logger;

public class ControleRemoto implements Controlador{
    // Atributos
    private int volume;
    private int antigoVolume;
    private boolean ligado;
    private boolean tocando;
    // Metodos especiais
    public ControleRemoto(){
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    private int getVolume(){
        return this.volume;
    }

    private int getAntigoVolume() {
        return antigoVolume;
    }
    private void setAntigoVolume(int antigoVolume) {
        this.antigoVolume = antigoVolume;
    }
    
    private boolean getLigado() {
        return ligado;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    // Metodos abistratos
    @Override
    public void ligar() {
        this.setLigado(true);
        System.out.println("Televisão ligada!");
    }
    @Override
    public void desligar() {
        this.setLigado(false);
        System.out.println("Televisão desligada!");
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){
            System.out.println("----MENU----");
            System.out.println("Está ligado? "+this.getLigado());
            System.out.println("está tocando? "+this.getTocando());
            System.out.println("Volume: "+this.getVolume());
            for(int i = 0; i <= this.getVolume();i+=10){
                System.out.print("|");
            }
            System.out.println("");
        } 
        else{
            System.out.println("Televisão desligada");
        }
    }
    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }
    
    @Override
    public void maisVolume() {
        if(this.getLigado() && this.getVolume() < 100){
            this.setVolume(this.getVolume()+5);
            System.out.println("Volume aumentado para "+this.getVolume());
        }
        else{
            System.out.println("Impossível aumentar volume");
        }
    }
    @Override
    public void menosVolume() {
        if(this.getLigado()&& this.getVolume() > 0){
            this.setVolume(this.getVolume()-5);
            System.out.println("Volume diminuado para "+this.getVolume());
        }
        else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume() > 0){
            this.setAntigoVolume(this.getVolume());
            this.setVolume(0);
            System.out.println("Mudo ligado!");
        }
        
    }
    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(this.getAntigoVolume());
        System.out.println("Mudo desativado! Voltando para o som "+this.getVolume()+".");
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !this.getTocando()){
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
