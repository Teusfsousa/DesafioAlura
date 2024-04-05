package Pacotes.Classes.Aluno;

public class Aluno {
    private String nome;
    private Double nota1;
    private Double nota2;


    public void setNome(String nome){
    this.nome = nome;

    }
    public void setNota1(Double nota1){
        this.nota1 = nota1;
    }
    public void setNota2(Double nota2){
        this.nota2 = nota2;
    }

    public double CalculaMedia(){
        return (nota1 + nota2) / 2;

    }

    public void ExibeMedia(){
        System.out.println("O nome do aluno(a) é " + nome);
        System.out.println("As notas do aluno foram " + nota1 + " " + nota2);

    }

}
