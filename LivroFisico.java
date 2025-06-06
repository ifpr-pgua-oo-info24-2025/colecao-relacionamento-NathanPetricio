public class LivroFisico extends livro{
    protected int numeroDePaginas;

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public livroFisico(String titulo, int anoPublicacao, Autor autor, int numeroDePaginas){
        super(titulo, anoPublicacao, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirDetalhes(){
        System.out.println("\n\nTitulo: " + getTitulo());
        System.out.println("Ano Publicacao: " + getAnoPublicacao());
        System.out.println("Numero Paginas: " + numeroDePaginas);
        System.out.println("Autor: " + getAutor().getNome());
        System.out.println("Nacionalidade: " + getAutor().getNacionalidade());
    }

}