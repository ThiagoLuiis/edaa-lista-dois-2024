package QuestãoB;

public class ModeloBasico implements Celular {
    

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando Telefone ...");
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        System.out.println("Desligando Telefone ...'");
    }

    @Override
    public void fazerLigacao(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Fazendo Ligação ...");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        // TODO Auto-generated method stub
        System.out.println("Enviando Mensgem ...");

    }

    
}
    

