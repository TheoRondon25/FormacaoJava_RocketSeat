import java.awt.*;
import java.time.LocalDate;

// apenas estudo
public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    Double saldo;
    boolean ativo = true;

    Double consultarSaldo() {
        return saldo;
    }

    List consultarExtrato (LocalDate dataInicial, LocalDate dataFinal) {
        return new List();
    }

    void cancelar (String justificativa){
        ativo = false;
    }

    void transferir (ContaCorrente contaDestino, Double valorSolicitado){

    }

    void sacar (Double valorSolicitado){

    }
}
