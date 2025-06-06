public class LivroDigital extends livro{
    protected Double tamanhoDoArquivoMB;

    public Double getTamanhoDoArquivoMB() {
        return tamanhoDoArquivoMB;
    }

    public void setTamanhoDoArquivoMB(Double tamanhoDoArquivoMB) {
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }

    public void exibirDetalhes(){
        System.out.println("\n\nTitulo: " + getTitulo());
        System.out.println("Ano Publicacao: " + getAnoPublicacao());
        System.out.println("Tamanho: " + tamanhoDoArquivoMB);
        System.out.println("Autor: " + getAutor().getNome());
        System.out.println("Nacionalidade: " + getAutor().getNacionalidade());
    }

    public livroDigital(String titulo, int anoPublicacao, Autor autor, Double tamanhoDoArquivoMB){
        super(titulo, anoPublicacao, autor);
        this.tamanhoDoArquivoMB = tamanhoDoArquivoMB;
    }
}
