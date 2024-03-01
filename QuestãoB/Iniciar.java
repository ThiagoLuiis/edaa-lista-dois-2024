package QuestãoB;

class Iniciador {
    // método estático, pode ser chamado sem instanciar a classe
    public static void LigarTelefone(Celular veiculo) {
        veiculo.ligar();
        Celular Iphone = new ModeloBasico();
        Iniciador.LigarTelefone(Iphone); // ligando o motor...
    }


//Iniciador.iniciarMotor(tata); // ligando o motor do caminhão...
}