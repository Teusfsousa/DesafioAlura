package Pacotes.Classes.PacoteContaBancaria;

public class ContaBancaria {
    private String nome_Titular;
   private int numeroConta;
   private Double saldo;
    public void setNome_Titular(String nome_Titular) {
        this.nome_Titular = nome_Titular;
    }

    public void setNumeroConta(int numerousContao){
       this.numeroConta = numerousContao;
   }

     public void setSaldo(Double saldo) {

        this.saldo = saldo;
    }


    public void exibeDados(){
        System.out.println("Nome do titular " + nome_Titular);
        System.out.println("O numero da conta é : " + numeroConta);
        System.out.println("O saldo disponivel é " + saldo);
    }
}
