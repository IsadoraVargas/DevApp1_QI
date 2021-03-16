/*
Faça um programa onde o usuário digita 
vários números e, quando digitar 0, o 
programa pára e soma os valores digitados.
*/
package laços.de.repetição;
import java.util.Scanner;
public class Soma 
{
public static void main(String[] args) 
{
 Scanner ler = new Scanner(System.in);
 double num, soma = 0;            
 do  
 {
 System.out.println("Digite o número: ");
 num = ler.nextDouble();           
 if(num > 0) 
 soma = num + soma;
 }
 while (num > 0);
 System.out.println("Soma dos números: " + soma);
 num = num - 1;
}    
}