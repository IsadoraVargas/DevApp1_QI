
package desafio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Desafio 
{
public static void main(String[] args)        
{ 
Scanner leia = new Scanner(System.in);
ArrayList<Integer> quantElm = new ArrayList<>();

System.out.println("Digite os números números que deseja armazenar: " + "*\n" + "--Digite 0 (zero) para finalizar--");

int num = 0;
do 
{
System.out.println("Digite o número: ");
num = leia.nextInt();
quantElm.add(num);
} 
while (num > 0);
System.out.println("Números armazenados: " + quantElm);
int numConjunto;

System.out.println("Quantos elementos deseja visualizar? ");
numConjunto = leia.nextInt();
System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
int elm = 0;
for (int i = 0; i < numConjunto; i++) 
{
elm = quantElm.get(i);
System.out.println(elm);
}
System.out.println("Números gravados no conjunto: " + "*\n" + quantElm );
}   
}   

