public class Livro {
    protected String titulo;
    protected int anoPublicacao;
    protected Autor autor;
    
    
    public autor getAutor() {
        return autor;
    }
    
    public void setAutor(autor autor) {
        this.autor = autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public livro(String titulo, int anoPublicacao, autor autor) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
   }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Ano De Publicacao: " + anoPublicacao);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Nacionalidade: " + autor.getNacionalidade());
    }

    
}
