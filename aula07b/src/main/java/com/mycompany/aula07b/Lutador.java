/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula07b;

/**
 *
 * @author Admin
 */
public class Lutador implements Atividades{
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    
    
    
    // Métodos especiais
    private String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }
    
    private String getNacionalidade() {
        return nacionalidade;
    }
    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }
    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }
    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }
    private void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    private String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if(this.getPeso() < 52.2){
            this.categoria = "Inválido";
        }
        else if(this.getPeso()  <= 70.3){
            this.categoria = "Leve";        
        }
        else if(this.getPeso()  <= 83.9){
            this.categoria = "Médio";
        }
        else if(this.getPeso()  <= 120.2) {
            this.categoria = "Pesado";
        }
        else{
            this.categoria = "Inválido";
        }
    }

    private int getVitorias() {
        return vitorias;
    }
    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }
    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }
    private void setEmpates(int empates) {
        this.empates = empates;
    }
    
    // Metodos abistratos

    @Override
    public void apresentar() {
        System.out.println("----------------------");
        System.out.println(this.getNome()+" é um lutador quem veio diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade()+" anos e "+this.getAltura()+"m de altura");
        System.out.println("Pesando "+this.getPeso()+"Kg");
        System.out.println("Possuindo "+this.getVitorias()+" Vitórias, "+this.getDerrotas()+" Derrotas e "+this.getEmpates()+" Empates");
    }

    @Override
    public void status() {
        System.out.println(this.getNome());
        System.out.println("É um peso "+this.getCategoria());
        System.out.println(this.getVitorias()+" Vitórias");
        System.out.println(this.getDerrotas()+" Derrotas");
        System.out.println(this.getEmpates()+" Empates");
        
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
}