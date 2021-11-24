package ConstrutoresSobrecargaEncapsulamento.Exercicio01.Entidades;

public class Conta {

    private String nome;
    private int numeroDaConta;
   private double valor;

    public Conta(){
        this.valor = 100;
    }

    public double addValor(double valor) {
       return this.valor += valor;
    }

    public double removeValor(double valor) {
        return this.valor -= valor;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumeroDaConta(){
        return this.numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta){
        this.numeroDaConta = numeroDaConta;
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
         this.valor = valor;
    }




}
