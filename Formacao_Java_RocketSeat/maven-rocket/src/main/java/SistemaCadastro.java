public class SistemaCadastro {
    public static void main(String[] args) {
        FabricaConexao.conectar();
        CadastroRepository repository = new CadastroRepository();
        Cadastro cadastro = new Cadastro();
        cadastro.setNome("Rodrigo");
        cadastro.setIdade(46);

        repository.salvar(cadastro);
    }
}
