package model;

import excecoes.BethaCodeException;

public class Conta {

    private String dono;
    private double saldo;

    public Conta(String dono) {
        this.dono = dono;
    }

    public void deposito(double valorDeposito) throws NullPointerException{
        if (valorDeposito <= 0){
            throw new NullPointerException("Valor do depósito inválido!");
        }
        this.saldo = this.saldo + valorDeposito;
    }

    public void saque(double valorSaque) throws IllegalArgumentException{
        if(valorSaque <= 0){
            throw new IllegalArgumentException(valorSaque + " é inválido para operação de saque!!");
        }
        if(valorSaque > this.saldo){
            throw new IllegalArgumentException(valorSaque + " é maior que o saldo da conta R$: " + this.saldo);
        }
        this.saldo = this.saldo - valorSaque;
    }

    public double getSaldo() {
        return saldo;
    }
}
