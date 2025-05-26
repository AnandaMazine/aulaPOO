package exercicioaula02;

public class ExercicioAula02 {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        
        l1.titulo = "Crepusculo";
        l1.autor = "Stephanie Meyer";
        l1.editora = "Intrinseca";
        l1.ano = 2005;
        l1.pagina = 416;
        l1.fechado =  false;
        
        l1.status();
        l1.ler();
        l1.abrir();
        l1.fechar();
        
    }
    
}
