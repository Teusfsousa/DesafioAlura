import java.sql.SQLOutput;
import java.util.Scanner;
import Idade.pessoa.IdadePessoa;
import PacoteContaBancaria.ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //****************ContaBnacaria**********************
        ContaBancaria conta = new ContaBancaria();
        conta.setNome_Titular("Bruna Couto");
        System.out.println("Tecle C para consultar : ");
        String telce = scan.nextLine();
        conta.getSaldo(100.00);
        conta.numeroDe_Conta(12345);
        conta.exibeDados();


        //****************Idade.pessoa.IdadePessoa**********************
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Juca");
        System.out.println("Digite sua idade");
        int recebeIdade = scan.nextInt();
        pessoa.exibi();
    }

    }