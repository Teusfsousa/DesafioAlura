package PacoteContaBancaria;

public class ContaBancaria {
    private String nome_Titular;
   private int numeroConta;
   private Double saldo;
    public void setNome_Titular(String nome_Titular) {
        this.nome_Titular = nome_Titular;
    }

    public void numeroDe_Conta(int Numero){
       this.numeroConta = numeroConta;
   }

    public void getSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double saldo(){
        return saldo;
        }

    public void exibeDados(){
        System.out.println("Nome do titular " + nome_Titular);
        System.out.println("O numero da conta é : " + numeroConta);
        System.out.println("O saldo disponivel é " + saldo);
    }
}
