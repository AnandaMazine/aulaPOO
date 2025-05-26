package exercicioaula02;

public class Livro {
    String titulo;
    String autor;
    String editora;
    int ano;
    int pagina;
    boolean fechado;
    
    void status(){
        System.out.println("Titulo " +this.titulo);
        System.out.println("Autor " +this.autor);
        System.out.println("Editora: " +this.editora);
        System.out.println("Ano: " +this.ano);
        System.out.println("Quantidade de paginas: " +this.pagina);
        System.out.println("Esta fechado? " +this.fechado);
    }
    
    void abrir (){
        this.fechado = false;
        
    }
    void fechar (){
        this.fechado = true;
    }
    void ler(){
        if (this.fechado == true){
            System.out.println("Não esta aberto no momento!");
        }else{
            System.out.println("SHIUUU! Estou lendo no momento");
        }
        
    }
}