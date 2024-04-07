package Idade.pessoa;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;

    }
    public void exibi() {
        if (idade >= 18) {
            System.out.println("É maior de 18");

        } else {
            System.out.println("Não é maior de 18!");
        }
      }
    }

