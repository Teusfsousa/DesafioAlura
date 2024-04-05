package Pacotes.Classes.livro;

public class Livro {
    private String nomeLivro;
    private String nomeAutorLivro;

    public void setNomeAutorLivro(String nomeAutorLivro) {
        this.nomeAutorLivro = nomeAutorLivro;
    }

    public void setNomeLivro(String nomeLivro){
       this.nomeLivro = nomeLivro;
   }
    public void exibiFichaTecnicaLivro(){
        System.out.println("O nome do autor do livro é " + nomeAutorLivro);
        System.out.println("Nome do livro escrito por ele é " + nomeLivro);
    }
}
