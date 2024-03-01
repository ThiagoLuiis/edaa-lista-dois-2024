package QuestãoB;

public class ModeloBasico implements Celular {
    

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        System.out.println("Ligando Telefone Basico ...");
    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        System.out.println("Desligando Telefone Basico ...'");
    }

    @Override
    public void fazerLigacao(String numero) {
        // TODO Auto-generated method stub
        System.out.println("Fazendo Ligação para:" + numero + " usando celular Basico");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        // TODO Auto-generated method stub
        System.out.println("Enviando Mensgem para " + numero +": "+ mensagem);

    }

    
}
    

