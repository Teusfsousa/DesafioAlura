import PacoteContaBancaria.ContaBancaria;

public class Principal {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.setNome_Titular("Bruna Couto");
        conta.getSaldo(100.00);
        conta.numeroDe_Conta(12345);
    }
}