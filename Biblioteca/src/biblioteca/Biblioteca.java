package biblioteca;
import java.util.Scanner;
public class Biblioteca {

    public static void main(String[] args) {
        Scanner leia = new Scanner (System.in);
        Cliente c1  = new Cliente ();
        Livro l1 = new Livro();        
    System.out.println("Nome do cliente: ");
    c1.nome = (leia.nextLine());
    System.out.println("Idade do cliente: ");
    c1.setIdade(leia.nextInt());
    System.out.println("Orçamento do cliente: ");
    l1.setOrcamento(leia.nextDouble());
    System.out.println("________________________");
    
    System.out.println("Insira o titulo do livro: ");
    l1.titulo = (leia.next());
    System.out.println("Insira o ano do livro: ");
    l1.ano = (leia.nextInt());
    System.out.println("Insira o preço do livro: ");
    l1.setPreco(leia.nextDouble());
    System.out.println("________________________");
    
    System.out.println("Verificando dado: ");
System.out.println("Livro: " + l1.getTitulo());
System.out.println("Autor: " + l1.getAno());
System.out.println("Preço: " + l1.getPreco());
System.out.println(l1.verificarPreco());
    
    }
    
}
