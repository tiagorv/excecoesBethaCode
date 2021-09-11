package aplicacao;

import excecoes.BethaCodeException;
import excecoes.FuncaoExemplo;
import model.Conta;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Scanner;

public class MinhaApp {
    public static void main(String[] args){
        //Exemplo com try/catch no metodo aumentarFrase
        //FuncaoExemplo.aumentaFrase("tiago");

        //Exemplo com throws no metodo diminuirFrase
        /*try {
            FuncaoExemplo.diminuirFrase("TIAGO");
        } catch (SQLException e) {
            System.out.println("Gerou erro com problema no SQL...");
        } catch (NullPointerException e){
            System.out.println("Gerou erro com valor nulo informado...");
        }*/

        //Exemplo com exceção propria
        //new BethaCodeException();

        Scanner sc = new Scanner(System.in);

        Conta novaConta = new Conta("Tiago Valério");
        int opcao = 0;
        do{
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("0 - Finalizar");
            System.out.print("Opção:");
            opcao = sc.nextInt();

            try{
                if (opcao == 1){
                    System.out.print("Valor do depósito: ");
                    double valorDepositar = sc.nextDouble();
                    novaConta.deposito(valorDepositar);
                }else if(opcao == 2){
                    System.out.print("Valor do saque: ");
                    double valorDoSaque = sc.nextDouble();
                    novaConta.saque(valorDoSaque);
                }else if(opcao == 3){
                    System.out.println("Saldo da Conta R$: " + novaConta.getSaldo());
                }else if(opcao == 0){
                    System.out.println("Programa encerrado!!!!");
                }else{
                    System.out.println("Opção Inválida!!!!");
                }
            }catch (Exception excecoes){
                System.out.println(excecoes);
            }
        }while(opcao != 0);
    }
}
