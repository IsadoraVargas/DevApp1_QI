
package estudodirigido;

import java.util.Scanner;

public class Produto 
{

public static void main(String[] args) 
{
Scanner leia = new Scanner (System.in);
String livro;
double valor;
System.out.println ("Digite o Titílo do livro: ");
livro =leia.nextLine();         
        
System.out.println("Digite o preço do livro: ");
valor = leia.nextDouble();

System.out.println("¨¨Verificando o desconto: ¨¨");
System.out.println("Livro " + livro + "recebeu o deconto") ;
System.out.println("Preço riginal: " + valor + "\n" + "Com desconto de 2,5%: " + valor/02.5 );       
}  
}
