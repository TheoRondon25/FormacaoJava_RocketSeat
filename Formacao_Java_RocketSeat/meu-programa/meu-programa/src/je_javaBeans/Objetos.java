package je_javaBeans;

public class Objetos {
    public static void main(String[] args) {
        Aluno theo = new Aluno();

        theo.setNome("Theo Rondon");
        System.out.println(theo.getNome());

        theo.setIdade(19);
        System.out.println(theo.getIdade());
    }
}
