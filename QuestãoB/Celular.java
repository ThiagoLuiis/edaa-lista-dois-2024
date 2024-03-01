package QuestãoB;

/*
Interface Celular: Deve definir os métodos ligar(), desligar(), 
fazerLigacao(String numero) e enviarMensagem(String numero, String mensagem). */


/*
Classe ModeloBasico: Deve implementar a interface Celular.
 Esta classe representa um modelo básico de celular que apenas registra em console as ações 
 executadas (por exemplo, exibir uma mensagem quando uma ligação é feita ou uma mensagem é enviada). */


public interface Celular {
public void ligar();
public void desligar();
public void fazerLigacao(String numero);
public void enviarMensagem(String numero, String mensagem);

    
    
}

