import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }         
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloDeAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloDeAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloDeAno.add(l);
                }
            }
        }
        return livroPorIntervaloDeAno;        
    }

    public List<Livro> PesquisarPorTitulo(String titutlo){
        List<Livro> livroPorTitulo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titutlo)) {
                    livroPorTitulo.add(l);
                }
            }
        }
        return livroPorTitulo;
    }


    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("livro 1", "Valentina", 2020);
        catalogo.adicionarLivro("livro 2", "Valentina", 2021);
        catalogo.adicionarLivro("livro 3", "baruk", 2018);
        catalogo.adicionarLivro("livro 4", "panchito", 2020);
        catalogo.adicionarLivro("livro 5", "Valentina", 2010);
        catalogo.adicionarLivro("livro 6", "valentina", 2017);


        System.out.println(catalogo.pesquisaAutor("valentina"));
        System.out.println(catalogo.pesquisaPorIntervaloDeAnos(2010, 2020));
        
    }

}
