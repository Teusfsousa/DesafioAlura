package Pacotes.Classes.Produto;

public class Produto {
    private String nome;
    private int preco;
    private int valorDesconto;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(int preco){
        this.preco = preco;
    }

    public void getValorDesconto(int desconto){
        this.valorDesconto = desconto;
    }
    public void ExibeFicha(){
        System.out.println("O nome do seu produto é : " + nome);
        System.out.println("O valor dele é : " + preco + " mas com o desconto aplicado ficou " + valorDesconto);

    }

}
