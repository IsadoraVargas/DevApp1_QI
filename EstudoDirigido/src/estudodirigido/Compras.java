
package estudodirigido;
import java.util.ArrayList;
import java.util.Scanner;
public class Compras 
{
public static void main(String[] args) 
{
    String itens = "a";
 Scanner leia = new Scanner (System.in);
          Prod p1 = new Prod();
 ArrayList<String> Compras = new ArrayList<>();
 System.out.println("Quantos itens deseja adicionar?" + "\n" + " -Na adição de mais de 4 produtos, recebe 15% de desconto no preço final-");
 p1.setQuant(leia.nextInt());

 int x = 1;
 double y = 1;
 leia.nextLine();
 while(x <= p1.getQuant())
 {
    System.out.println("Adicione um o item na lista: ");
    itens = leia.nextLine();
    Compras.add(itens);  
    leia.nextLine();
    System.out.println("Qual o preço do produto? ");
    p1.setPreco(leia.nextFloat());
    System.out.println("_______________________________"); 
    x++;
    y++;    
 }
System.out.println("Lista de Compras fechada: " + Compras);
System.out.println("Desconto adicionado: " + p1.verDesc());  
}    
}

