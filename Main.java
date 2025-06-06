import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<livro> biblioteca = new ArrayList<>();
        
        Autor autor = new Autor("Machado de Assis", "Brasileira");
        Autor autor2 = new Autor("Robert C. Martin", "Americana");

        LivroFisico livro = new LivroFisico("Dom Casmurro", 1899, autor, 256);
        LivroDigital livro2 = new LivroDigital("Cleam Code", 2008, autor2, 1.5);

        biblioteca.add(livro);
        biblioteca.add(livro2);

        for(Livro livro : biblioteca){
            livro.exibirDetalhes();
        }
    }
}
