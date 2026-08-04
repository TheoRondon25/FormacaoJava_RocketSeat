package je_expressoes;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String nome = "Theo";
        Integer matricula = 123;
        Double salario = 1000.50;
        String dadosFuncionario = String.format("Mat.: %d - Nome: %s - Sal.: %,.2f", matricula, nome, salario);
        //s, d, f, t
        System.out.println(dadosFuncionario);
    }

}
