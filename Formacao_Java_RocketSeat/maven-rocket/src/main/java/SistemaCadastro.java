import java.util.List;

public class SistemaCadastro {
    public static void main(String[] args) {
        FabricaConexao.conectar();
        CadastroRepository repository = new CadastroRepository();
        Cadastro cadastro = new Cadastro();

        // INSERT
        /*
        cadastro.setNome("Rodrigo");
        cadastro.setIdade(46);

        repository.incluir(cadastro);
         */

        // UPDATE
        /*
        cadastro.setNome("Rodrigo Rondon");
        cadastro.setIdade(46);
        cadastro.setId(4);

        repository.alterar(cadastro);
         */

        // DELETE
        /*
        repository.excluir(4);
         */

        // SELECT ALL
        /*
        List<Cadastro> cadastros = repository.listar();
        for(Cadastro c: cadastros) {
            System.out.println(c.getId() + " " + c.getNome());
        }
         */

        // SELECT BY ID
        Cadastro cadastro1 = repository.buscar(1);
        if(cadastro1 != null) {
            System.out.println(cadastro1.getId() + " " + cadastro1.getNome());
        } else {
            System.out.println("Nao foi possivel localizar um cadastro pelo id");
        }

    }
}
