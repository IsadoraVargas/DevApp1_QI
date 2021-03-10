package exercico1;
import java.util.Scanner;

public class Exercicio1 {
int numero ; 
static Scanner leia = new Scanner(System.in) ;
   
public static void main(String[] args) {
System.out.println("Digite o número: ") ;
int numero = leia.nextInt() ;

if( numero <0 ) { 
 System.out.println("O numero é: Negativo"); 
}else{
 System.out.println("O numero é: Positivo");   
}
}
}