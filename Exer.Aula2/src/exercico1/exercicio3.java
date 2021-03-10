
package exercico1;
import java.util.Scanner;

public class exercicio3 {
 double v1;
 double v2;
 static Scanner leia = new Scanner(System.in) ;
 
public static void main(String[] args) {
   System.out.println ("Digite o primeiro valor: ") ;
  double v1 = leia.nextDouble () ;
   
   System.out.println ("Digite o segundo valor: ") ;    
  double v2 = leia.nextDouble() ;
   
    if(v1 > v2 ) {
   System.out.println("O primeiro é o valor maior");
  }else{
   System.out.println("O segundo é o valor maior") ;
    }
}
}