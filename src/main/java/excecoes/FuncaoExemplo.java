package excecoes;

import java.sql.SQLException;

public class FuncaoExemplo {

    public static void aumentaFrase(String frase){
        String novaFrase = null;
        try{
            novaFrase = frase.toUpperCase();
            System.out.println("Frase Antiga: " + frase);
            System.out.println("Frase Nova: " + novaFrase);
        }catch (NullPointerException e){
            System.out.println("Metodo não pode ser executado com valor nulo!!!");
        }finally {
            System.out.println("Aqui sempre executa!!!");
        }
    }

    public static void diminuirFrase(String frase) throws NullPointerException, SQLException {
        String novaFrase = frase.toLowerCase();
        System.out.println("Frase Antiga: " + frase);
        System.out.println("Frase Nova: " + novaFrase);
    }
}
