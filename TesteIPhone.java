public class TesteIPhone {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando ReprodutorMusical
        meuIPhone.tocarMusica();
        meuIPhone.pausarMusica();
        meuIPhone.selecionarMusica("Imagine - John Lennon");

        // Testando AparelhoTelefonico
        meuIPhone.fazerChamada("123456789");
        meuIPhone.atenderChamada();
        meuIPhone.encerrarChamada();

        // Testando NavegadorInternet
        meuIPhone.exibirPagina("https://www.google.com");
        meuIPhone.adicionarNovaAba("https://www.github.com");
        meuIPhone.atualizarPagina();
    }
}
