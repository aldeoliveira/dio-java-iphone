public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    public void atender() {
        System.out.println("Atendeu a ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void selecionarMusica(String nomeMusica) {
        System.out.println("Selecionou a música '" + nomeMusica + "'");
    }

    public void tocar() {
        System.out.println("Tocando a música");
    }

    public void pausar() {
        System.out.println("Pausou a música");
    }

    public void exibirPagina(String url) {
        System.out.println("Abrindo a página '" + url + "'...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionou nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizou a página");
    }
}
