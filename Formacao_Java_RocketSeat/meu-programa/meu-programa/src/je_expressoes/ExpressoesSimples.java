package je_expressoes;

import java.time.LocalDate;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Theo Poletti Rondon";
        Integer matricula = 123;
        Double salario = 1000.50;
        LocalDate dataAdmissao = LocalDate.now();
        //s, d, f, t

        String dataImpressa = String.format("Data: %td/%<tm/%<tY", dataAdmissao);
        System.out.println(dataImpressa);

        String dadosFuncionario = String.format("Mat.: %05d Nome: %-15.15s Sal.: %,.2f", matricula, nome, salario);
        System.out.println(dadosFuncionario);
    }

}
