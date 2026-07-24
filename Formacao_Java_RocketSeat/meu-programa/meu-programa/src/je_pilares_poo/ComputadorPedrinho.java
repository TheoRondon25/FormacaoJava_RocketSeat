package je_pilares_poo;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        SistemaMensagemInstantanea smi = null;

        /*
            NAO SE SABE QUAL APP
            MAS QUALQUER UM DEVE ENVIAR E RECEBER MENSAGEM
        */

        String appEscolhido = "fbm";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
