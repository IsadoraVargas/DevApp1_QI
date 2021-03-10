
package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    double variavel; 
    static Scanner leia = new Scanner(System.in) ;
   
public static void main(String[] args) {
    System.out.println("Digite o valorde 'a': ") ;
    double variavel = leia.nextDouble() ;
    System.out.println("Os resultados são: ") ;
    System.out.println("O dobro da variáve é: " + (variavel*2 )) ;
    System.out.println("O triplo do dobro da variável é: " + (variavel*2*3 )) ;
    System.out.println("A metade do triplo do dobro da variável é: "+ (variavel*2*3/2 ));
    System.out.println("O Quadrado da variáve é: " + (variavel * variavel ));
    System.out.println("A quinta parte do dobro da variável é: " + (variavel*2/5 ));
    }



 
    