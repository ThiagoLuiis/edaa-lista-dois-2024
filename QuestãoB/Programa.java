package QuestãoB;

public class Programa {
    public static void main(String[] args) {

        System.out.println("\n***********************  Telefone Basico  *************************\n");
        ModeloBasico celularBasico = new ModeloBasico();
        celularBasico.ligar();
        celularBasico.desligar();
        celularBasico.fazerLigacao("12345678");
        celularBasico.enviarMensagem("40028922", "Que Pena, Jogo da vida");


        System.out.println("\n***********************  Telefone Avançado  *************************\n");
        ModeloAvancado celularAvancado = new ModeloAvancado();
        celularAvancado.ligar();
        celularAvancado.ligar();
        celularAvancado.ligar();

        
        celularAvancado.desligar();
        celularAvancado.fazerLigacao("98877665544");
        celularAvancado.fazerLigacao("98242455214");
        celularAvancado.enviarMensagem("91556548944", "Esse numero não existe!!!\n");
        System.out.println("\n=== Histórico do Modelo Avançado ===");
        celularAvancado.mostrarHistoricoLigacoes();
        celularAvancado.mostrarHistoricoMensagens();
        celularAvancado.mostrarHistoricoLigado();

    }
}