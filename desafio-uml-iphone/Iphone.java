public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public Iphone() {}

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }
    
    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }
    
    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
    
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }
    
    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }
    
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
    
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }
    
    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova página...");
    }
    
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
