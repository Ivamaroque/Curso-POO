/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula05;

public class Banco {
    // declaração dos tipos de variaveis
    public int numConta; // publica, qualquer um tem acesso
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    // Metodos especiais //
    //constructor da classe Banco
    public Banco(){
        this.setStatus(false); // status começa falso, ou seja, conta desativada
        this.setSaldo(0); // saldo começa zerado
    }
    //get e set para número da conta
    public int getNumConta() {
        return numConta;
    } // get serve para puxar o valor
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }// set serve para inserir valor
    //get e set para tipo da conta
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //get e set para dono da conta
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    //get e set para saldo da conta
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    //get e set para status da conta
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //metodos personalizados
    public void abrirConta(String t){
        this.setTipo(t); // Inserindo o tipo da conta, sendo cc ou cp
        this.setStatus(true);
        if(t == "cc"){ // conta corrente inicia com o saldo de 50 reais
            this.setSaldo(50);
        }
        else if(t == "cp"){
            this.setSaldo(150); // conta poupança inicia com o saldo 150 reais
        }
        else{
            this.setStatus(false); // caso não seja nem cc e nem cp, alerta de conta inválida
            System.out.println("ERRO! Insira tipo valido.");
        }
    }
    public void fecharConta(){
        if(saldo > 0){
            System.out.println("Conta com dinheiro"); // conta com saldo restante
        }
        else if(saldo < 0){
            System.out.println("Conta em débito"); //conta com saldo negativo
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!"); //para fechar a conta, não pode haver penalidade
        }
    }
    public void depositar(float valor){
        if(this.getStatus()){ // check para ver se a conta está ativa
            this.setSaldo(this.getSaldo()+valor); // somando o valor utilizando o getSaldo
            System.out.println("Depósito de valor R$"+valor+" realizado com sucesso!");
        }
        else{ // caso não está ativa, alerta de conta fechada
            System.out.println("Conta está fechada.");
        }
    }
    public void sacar(float valor){
        if(this.getStatus() && this.getSaldo() >= valor){ // irá pegar o valor de status e de saldo, caso positivo para os dois irá sacar o valor
            this.setSaldo(this.getSaldo()-valor);
            System.out.println("Saque de valor R$"+valor+" realizado na conta de "+this.getDono());
        }
        else if(this.getStatus() && this.getSaldo() < valor){ // caso saldo seja negatitvo e o saldo for menor que o valor
            System.out.println("Impossível sacar, saldo insuficiente.");
        }
        else{ // impossivel sacar pois o status é false
            System.out.println("Impossível sacar, conta desativada.");
        }
    }
    public void pagarMensal(){
        float v;
        if(this.getTipo() == "cc"){ // caso tipo seja cc, terá decressimo de 12 reais
            v = 12f;
        }
        else if(this.getTipo() == "cp") { // 
            v = 20f;
        }
        else{
            System.out.println("Impossivel pagar mensalidade, tipo de conta invalido");
        }
        if(this.getStatus() && this.getSaldo()> v){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidae paga, saldo restante: R$"+this.getSaldo());
        }
        else{
            System.out.println("Impossível pagar mensalidade");
        }
    }
    public void estadoAtual(){
        System.out.println("----------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
}
