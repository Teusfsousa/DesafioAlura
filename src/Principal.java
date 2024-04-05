import java.util.Scanner;

import Pacotes.Classes.Aluno.Aluno;
import Pacotes.Classes.livro.Livro;
import Pacotes.Classes.pessoa.IdadePessoa;
import Pacotes.Classes.PacoteContaBancaria.ContaBancaria;
import Pacotes.Classes.Produto.Produto;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //****************ContaBnacaria**********************
        ContaBancaria conta = new ContaBancaria();
        conta.setNome_Titular("Bruna Couto");
        System.out.println("Tecle C para consultar : ");
        String tecla = scan.nextLine();
        conta.setSaldo(100.00);
        conta.setNumeroConta(12345);
        conta.exibeDados();


        //*****************idade.pessoa.IdadePessoa**************
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Juca");
        System.out.println("Digite sua idade");
        int recebeIdade = scan.nextInt();
        pessoa.setIdade(recebeIdade);
        pessoa.exibiMensagemIdade();

        //********************Pacote.Produto.Pacote.Produto***************************
        Produto product = new Produto();
        product.setNome("Melão");
        product.setPreco(25);
        product.getValorDesconto(10);
        product.ExibeFicha();

        //**************************Pacote.Aluno.Pacote.Aluno************************
        Aluno aluno = new Aluno();
        aluno.setNota1(7.5);
        aluno.setNota2(8.7);
        aluno.setNome("Bruna");
        aluno.ExibeMedia();
        System.out.println("A média dele é " +  aluno.CalculaMedia());

        //***********************Pacote.livro.Livro**************************
        Livro livro = new Livro();
        livro.setNomeAutorLivro("Miran Leves");
        livro.setNomeLivro("A força do querer");
        livro.exibiFichaTecnicaLivro();
    }

    }