package excecoes;

public class BethaCodeException extends Exception{
    @Override
    public String getMessage() {
        return "Erro gerado pelo Betha Code!!!!";
    }
}
