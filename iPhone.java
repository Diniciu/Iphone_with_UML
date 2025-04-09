public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos do ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void fazerChamada(String numero) {
        System.out.println("Fazendo chamada para: " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    // Métodos do NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Nova aba aberta com URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
