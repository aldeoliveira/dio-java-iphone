public class Cliente {
    public static void main(String[] args) throws Exception {
        IPhone meuIPhone = new IPhone();

        // Funções como aparelho telefone
        meuIPhone.ligar("12345678");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        
        // Funções como navegador
        meuIPhone.exibirPagina("web.dio.me/users/aldeoliveira03");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();

        // Funções como tocador de música
        meuIPhone.selecionarMusica("Time");
        meuIPhone.tocar();
        meuIPhone.pausar();
    }
}
